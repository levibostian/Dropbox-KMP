import org.jetbrains.kotlin.gradle.plugin.mpp.pm20.util.archivesName
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

val coroutines_version = "1.6.3"
val serialization_version = "1.3.3"
val ktor_version = "2.0.3"

plugins {
    id("com.android.library").version("7.3.1")
    kotlin("multiplatform") version "1.7.21" // kotlin lang version
    kotlin("plugin.serialization") version "1.7.21" // kotlin lang version
    id("maven-publish")
    // KMMBridge is gradle tools for publishing Xcode frameworks. Used for making iOS KMM module available to use
    id("co.touchlab.faktory.kmmbridge") version "0.3.4"
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

kmmbridge {
    // Use maven repository for hosting compiled xcframework file.
    // Package.swift file will point to the remote URL.
    mavenPublishArtifacts()
    // I want to manually set the version of the module for more control.
    manualVersions()
    // Update Package.swift file.
    // I want to commit manually so I can add [skip ci] to message
    spm(commitManually = true)
}

// Configures KMM bridge to automatically use github repo packages for maven repo
addGithubPackagesRepository()
