import org.gradle.api.JavaVersion

/**
 * @author Vivien Mahe
 * @since 23/07/2022
 */

object Dependencies {

    object Versions {

        object Common {
            const val packageName = "com.tweener.common"
            const val versionName = "1.0"
            const val versionCode = 1
            const val applicationId = Common.packageName
            const val namespace = Common.packageName + ".android"
            const val compileSDK = 34
            const val targetSDK = compileSDK
            const val minSDK = 24

            object Jitpack {
                const val group = "com.github.Tweener"
                const val artifactId = "common-android"
            }
        }

        object Compiler {
            const val jvmTarget = "17"
            val javaCompatibility = JavaVersion.VERSION_17
        }

        const val kotlin = "1.9.10"
        const val gradle = "8.1.2"
        const val coroutines = "1.7.3"
        const val napier = "2.6.1"
        const val composeCompilerExtension = "1.5.3"
        const val compose = "1.6.0-alpha03"
        const val activityCompose = "1.7.2"
        const val navigationCompose = "2.7.2"
        const val material3 = "1.1.1"
        const val desugarJdkLibs = "2.0.3"
        const val accompanist = "0.32.0"

        object AndroidX {
            const val activity = "1.8.0-alpha07"
            const val appcompat = "1.4.2"
            const val constraintlayout = "2.1.4"
            const val lifecycle = "2.6.2"
            const val splashscreen = "1.0.1"
        }
    }

    object Libraries {

        const val napier = "io.github.aakira:napier:${Versions.napier}"
        const val material3 = "androidx.compose.material3:material3:${Versions.material3}"
        const val desugarJdkLibs = "com.android.tools:desugar_jdk_libs:${Versions.desugarJdkLibs}"

        object Coroutines {
            const val core = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Versions.coroutines}"
            const val android = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutines}"
        }

        object AndroidX {
            const val activity = "androidx.activity:activity-ktx:${Versions.AndroidX.activity}"
            const val appcompat = "androidx.appcompat:appcompat:${Versions.AndroidX.appcompat}"
            const val constraintlayout = "androidx.constraintlayout:constraintlayout:${Versions.AndroidX.constraintlayout}"
            const val lifecycleViewModel = "androidx.lifecycle:lifecycle-viewmodel-ktx:${Versions.AndroidX.lifecycle}"
            const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.AndroidX.lifecycle}"
            const val splashscreen = "androidx.core:core-splashscreen:${Versions.AndroidX.splashscreen}"

            object Compose {
                const val ui = "androidx.compose.ui:ui:${Versions.compose}"
                const val uiTooling = "androidx.compose.ui:ui-tooling:${Versions.compose}"
                const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:${Versions.compose}"
                const val foundation = "androidx.compose.foundation:foundation:${Versions.compose}"
                const val material = "androidx.compose.material:material:${Versions.compose}"
                const val materialIconsCore = "androidx.compose.material:material-icons-core:${Versions.compose}"
                const val materialIconsExtended = "androidx.compose.material:material-icons-extended:${Versions.compose}"
                const val activity = "androidx.activity:activity-compose:${Versions.activityCompose}"
                const val navigation = "androidx.navigation:navigation-compose:${Versions.navigationCompose}"
                const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime-compose:${Versions.AndroidX.lifecycle}"
            }
        }

        object Accompanist {
            const val systemUIController = "com.google.accompanist:accompanist-systemuicontroller:${Versions.accompanist}"
            const val placeholder = "com.google.accompanist:accompanist-placeholder:${Versions.accompanist}"
            const val navigationAnimation = "com.google.accompanist:accompanist-navigation-animation:${Versions.accompanist}"
        }
    }
}
