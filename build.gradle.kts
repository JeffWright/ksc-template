import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import com.github.jengelman.gradle.plugins.shadow.tasks.ShadowJar


plugins {
    kotlin("jvm") version "2.0.21"
    application
    id("com.github.johnrengelman.shadow") version "7.0.0"
    id("com.ncorti.ktfmt.gradle") version "0.11.0"
}


repositories {
    mavenLocal()
    mavenCentral()
    repositories { maven { setUrl("https://jitpack.io") } }
}

dependencies {
    implementation("com.github.JeffWright:scriptutils:+")
    implementation("com.github.ajalt.clikt:clikt:3.5.0")
    implementation("com.github.holgerbrandl:kscript-support-api:1.2.5")
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
}
