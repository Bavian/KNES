plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
}

val emulatorNamespace = "com.bavian.knes.emulator.impl"

group = emulatorNamespace
version = "unspecified"

kotlin {
    js(IR) {
        browser { }
        binaries.executable()
    }
    jvm()
    androidTarget {
        compilations.all {
            kotlinOptions {
                jvmTarget = "1.8"
            }
        }
    }

    sourceSets {
        commonMain.dependencies {
            implementation(project(":emulator:api"))

            implementation(libs.koin.core)

            implementation(project(":core-utils-api"))
            implementation(project(":emulator:memory:api"))
            implementation(project(":emulator:memory:impl"))
        }
        androidMain.dependencies {
            implementation(libs.koin.android)
            implementation(libs.koin.android.compat)
            implementation(libs.kotlinx.coroutines.android)
        }
    }
}

android {
    namespace = emulatorNamespace
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("src/androidMain/res")
    sourceSets["main"].resources.srcDirs("src/commonMain/resources")
}
