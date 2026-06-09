plugins {
    id("com.android.library") version "8.5.2"
    id("org.jetbrains.kotlin.android") version "2.0.21"
}

android {
    namespace = "com.foxblack.nativemusicplayer"
    compileSdk = 35

    defaultConfig {
        minSdk = 24
    }

    buildFeatures {
        buildConfig = true
    }
}

dependencies {
}
