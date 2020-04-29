import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("io.spring.dependency-management") version "1.0.9.RELEASE" apply false
    kotlin("jvm") version "1.3.71" apply false

    id("org.springframework.boot") version "2.2.6.RELEASE" apply false
    kotlin("plugin.spring") version "1.3.71" apply false
}

subprojects {
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = "com.github.jarko"

    repositories {
        mavenCentral()
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }

    tasks.withType<KotlinCompile> {
        kotlinOptions {
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
        }
    }
}
