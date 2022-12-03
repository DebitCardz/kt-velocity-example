plugins {
    kotlin("jvm") version "1.7.21"
    kotlin("kapt")
    kotlin("plugin.serialization") version "1.7.21"
    id("com.github.johnrengelman.shadow") version "7.1.2"
}

val kotlinVersion = "1.7.20"
val velocityVersion = "3.1.2-SNAPSHOT"

group = "me.tech"
version = "0.0.1"

repositories {
    mavenLocal()
    mavenCentral()

    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    implementation(kotlin("reflect"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-json:1.4.1")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-jdk8:1.6.4")
    implementation("net.kyori:adventure-api:4.11.0")

    implementation("com.github.shynixn.mccoroutine:mccoroutine-velocity-api:2.6.0")
    implementation("com.github.shynixn.mccoroutine:mccoroutine-velocity-core:2.6.0")

    compileOnly("com.velocitypowered:velocity-api:3.1.2-SNAPSHOT")
    kapt("com.velocitypowered:velocity-api:3.1.2-SNAPSHOT")
}

tasks.build {
    dependsOn(tasks.shadowJar.get())
}