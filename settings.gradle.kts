pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        maven {
            val authToken: String by settings

            setUrl("https://jitpack.io")
            credentials { username = authToken }
        }
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)

    repositories {
        google()
        mavenCentral()
        maven {
            val authToken: String by settings

            setUrl("https://jitpack.io")
            credentials { username = authToken }
        }
    }
}

rootProject.name = "CommonAndroid"
include(":library")
