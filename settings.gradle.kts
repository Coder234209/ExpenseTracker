pluginManagement {
    repositories {
        google() // Google's Maven repository
        mavenCentral() // Maven Central repository
        gradlePluginPortal() // Gradle plugin portal
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS) // Enforces repository settings here
    repositories {
        google() // Google's Maven repository
        mavenCentral() // Maven Central repository
    }
}

rootProject.name = "BudgetTracker2"
include(":app")