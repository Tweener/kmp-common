plugins {
    id("com.android.library")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = Dependencies.Versions.Common.namespace
    compileSdk = Dependencies.Versions.Common.compileSDK

    defaultConfig {
        minSdk = Dependencies.Versions.Common.minSDK

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        getByName("release") {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }

        getByName("debug") {
        }
    }

    compileOptions {
        sourceCompatibility = Dependencies.Versions.Compiler.javaCompatibility
        targetCompatibility = Dependencies.Versions.Compiler.javaCompatibility

        isCoreLibraryDesugaringEnabled = true
    }

    kotlinOptions {
        jvmTarget = Dependencies.Versions.Compiler.jvmTarget
    }
}

dependencies {

    coreLibraryDesugaring(Dependencies.Libraries.desugarJdkLibs)

    // Android
    implementation(Dependencies.Libraries.material3)
    implementation(Dependencies.Libraries.Accompanist.systemUIController)
    implementation(Dependencies.Libraries.Accompanist.placeholder)

    // Compose
    implementation(Dependencies.Libraries.AndroidX.Compose.ui)
    implementation(Dependencies.Libraries.AndroidX.Compose.uiTooling)
    implementation(Dependencies.Libraries.AndroidX.Compose.uiToolingPreview)
    implementation(Dependencies.Libraries.AndroidX.Compose.foundation)
    implementation(Dependencies.Libraries.AndroidX.Compose.material)
    implementation(Dependencies.Libraries.AndroidX.Compose.materialIconsCore)
    implementation(Dependencies.Libraries.AndroidX.Compose.materialIconsExtended)
    implementation(Dependencies.Libraries.AndroidX.Compose.activity)
    implementation(Dependencies.Libraries.AndroidX.Compose.navigation)
    implementation(Dependencies.Libraries.AndroidX.Compose.lifecycleRuntime)

    // Coroutines
    implementation(Dependencies.Libraries.Coroutines.core)
    implementation(Dependencies.Libraries.Coroutines.android)

    // Napier
    implementation(Dependencies.Libraries.napier)
}
