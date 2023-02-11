import org.jetbrains.kotlin.gradle.plugin.mpp.pm20.util.archivesName
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

val coroutines_version = "1.+"
val serialization_version = "1.+"
val ktor_version = "2.+"

plugins {
    id("com.android.library").version("7.3.1")
    kotlin("multiplatform") version "1.7.21" // kotlin lang version
    kotlin("plugin.serialization") version "1.7.21" // kotlin lang version
    id("maven-publish")
}

val packageName = "earth.levi"
val libraryName = "dropbox"
val libraryVersion = System.getenv("LIBRARY_VERSION") ?: "local"

group = packageName
version = libraryVersion

repositories {
    gradlePluginPortal()
    google()
    mavenCentral()
}

dependencyLocking {
    lockAllConfigurations()
}

kotlin {
    jvm()
    android {
        publishLibraryVariants("release", "debug")
    }
    ios {
        binaries {
            framework {
                baseName = libraryName
                freeCompilerArgs += "-Xobjc-generics" // suggested from openapi-generator 
            }
        }
    }
    js {
        browser() // include if you want to create client-side js
        nodejs()  // include if you want to create server-side js
    }
    
    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$serialization_version")

                api("io.ktor:ktor-client-core:$ktor_version")
                api("io.ktor:ktor-client-serialization:$ktor_version")
                api("io.ktor:ktor-client-content-negotiation:$ktor_version")
                api("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test"))
                implementation("io.ktor:ktor-client-mock:$ktor_version")
            }
        }

        val androidMain by getting
        val androidTest by getting

        val iosMain by getting {
            dependencies {
                api("io.ktor:ktor-client-ios:$ktor_version")
            }
        }
        val iosTest by getting

        val jsMain by getting {
            dependencies {
                api("io.ktor:ktor-client-js:$ktor_version")
            }
        }
        val jsTest by getting

        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib-jdk7"))
                implementation("io.ktor:ktor-client-cio-jvm:$ktor_version")
            }
        }

        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }
    }
}

android {
    namespace = "$packageName.$libraryName"
    compileSdk = 32
    defaultConfig {
        minSdk = 21
        targetSdk = 32
    }
}

// maven-publishing configuration 
publishing {
    publications {
        create<MavenPublication>("module") {
            groupId = packageName
            artifactId = libraryName
            version = version 

            pom {
                name.set("Dropbox KMP SDK")
                description.set("Kotlin Multiplatform library for interacting with the Dropbox API")
                url.set("https://github.com/levibostian/Dropbox-KMP/")
                licenses {
                    license {
                        name.set("MIT")
                        url.set("https://github.com/levibostian/Dropbox-KMP/blob/main/LICENSE")
                    }
                }
                developers {
                    developer {
                        id.set("levibostian")
                        name.set("Levi Bostian")
                        email.set("levi@curiosityio.com")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/levibostian/Dropbox-KMP.git")
                    developerConnection.set("scm:git:ssh://github.com/levibostian/Dropbox-KMP.git")
                    url.set("https://github.com/levibostian/Dropbox-KMP/")
                }
            }
        }
    }
    repositories {
        maven {
            // change URLs to point to your repos, e.g. http://my.org/repo
            val releasesRepoUrl = uri("")
            val snapshotsRepoUrl = uri("https://maven.pkg.github.com/levibostian/Dropbox-KMP")
            url = if (version.toString().endsWith("SNAPSHOT")) snapshotsRepoUrl else releasesRepoUrl
            
            credentials {
                username = System.getenv("MAVEN_PUBLISH_USERNAME")
                password = System.getenv("MAVEN_PUBLISH_PASSWORD")
            }
        }
    }
}
