import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar


plugins {
    kotlin("jvm") version "1.6.21"
    application
    id("com.github.johnrengelman.shadow") version "7.0.0"
}


repositories {
    mavenCentral()
    repositories { maven { setUrl("https://jitpack.io") } }
}

dependencies {
    implementation("com.github.JeffWright:scriptutils:0.6.2")
    implementation("com.github.ajalt.clikt:clikt:3.5.0")
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "11"
}
val compileKotlin: KotlinCompile by tasks
compileKotlin.kotlinOptions {
    jvmTarget = "11"
}

application {
    mainClass.set("MainKt")
}

tasks.withType<ShadowJar> {
    dependsOn("jar")
    archiveName = "ksc.$extension"
}
