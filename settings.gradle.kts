pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
    plugins {
        id("com.android.application") version "8.0.0" // Обновите до последней версии Android Gradle Plugin
        id("com.android.library") version "8.0.0"
        id("org.jetbrains.kotlin.jvm") version "1.9.0"
        id("org.jetbrains.kotlin.plugin.serialization") version "1.9.0"
    }
}

dependencyResolutionManagement {
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "MarketplaceApp"
include(":app")