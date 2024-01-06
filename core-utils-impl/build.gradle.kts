plugins {
    alias(libs.plugins.kotlinMultiplatform)
    alias(libs.plugins.androidLibrary)
}

val coreUtilsNamespace = "com.bavian.knes.core.utils.impl"

group = coreUtilsNamespace
version = "unspecified"

kotlin {
    js(IR) {
        browser {}
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
            implementation(project(":core-utils-api"))

            implementation(libs.koin.core)
        }
        jsMain.dependencies {
            implementation(libs.koin.core)
        }
        androidMain.dependencies {
            implementation(libs.koin.android)
            implementation(libs.koin.android.compat)
        }
    }
}

android {
    namespace = coreUtilsNamespace
    compileSdk = libs.versions.android.compileSdk.get().toInt()

    sourceSets["main"].manifest.srcFile("src/androidMain/AndroidManifest.xml")
    sourceSets["main"].res.srcDirs("src/androidMain/res")
    sourceSets["main"].resources.srcDirs("src/commonMain/resources")
}