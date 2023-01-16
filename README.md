# Dropbox KMP

Kotlin Multiplatform (KMP) module for the Dropbox API.

> Note: This project is a work in progress and is still under the concept phase. The project may rename or change focus at anytime without warning. I would not consider this project a fully featured Dropbox SDK and it may never become that. If all HTTP endpoints could be generated from an openapi spec for Dropbox, then a true replacement may be considered.

# Why?

Dropbox offers official SDKs for Android, iOS, web that can be used in a Kotlin Multiplatform app. I have done that before but there were some annoyances with this:

* **Easier setup** - Each of the official Dropbox SDKs requires unique setup. Meaning that for a KMP app, you need to provide your client secret and other Dropbox app information in multiple places. It would be better if there was consistency for all platforms.
* **Less boilerplate/duplicate code** - Every SDK has unique data types but yet, they still work the same way. This meant that if I wanted to list a directory in a Dropbox, I had some duplicate logic for each platform just to parse the unique data types. It would be easier to have 1 set of data types used by all platforms.
* **Faster compilation** - Compilation was slow. Kotlin Multiplatform's processing of the Dropbox Objective-C SDK took the longest of all the compilation tasks in my app. Making the feedback loop take longer.
* **Long-term productivity** - I would like to build many apps using Dropbox. Because of this, it can be more justified to build a library for Dropbox instead of building this module just for 1 app.

# Getting started

1. Install module in your app.

This is a KMP module, but it is published for use in any platform individually. Meaning, you do not need to be a KMP app to use this project.

* KMP app, do this.
* iOS/Swift app, do this.
* Android app, do this.
~~* Web app, do this.~~ Web is not under development at this time.

2. Create your Dropbox developer app so your app has access to the Dropbox API.

Provide this client secret information to the module.

3. Initialize authentication for each platform.

```kotlin
// Android
val dropboxClient = AndroidDropboxClientAuth(context)
```

```swift
// iOS
let dropboxClient = iOSDropboxClientAuth(viewController)
```

When you're ready, start the auth flow. Meaning, have your operating system open the Dropbox login webpage in a browser and start login.

```
dropboxClient.startAuthFlow()
```

4. After authentication has been completed, you can now call any of the Dropbox API endpoints.

The platform code is automatically generated from an openapi spec. So, the documentation for each platform and how to call each of the HTTP endpoints is provided in code reference docs:

* Kotlin
* Swift
* ~~Javascript/typescript~~ Could be provided in future.