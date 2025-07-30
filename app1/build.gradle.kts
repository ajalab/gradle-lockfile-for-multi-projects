plugins {
    id("buildsrc.convention.kotlin-jvm")
    alias(libs.plugins.springBootGradlePlugin)
}

dependencies {
    implementation(libs.springBootStarter)
}
