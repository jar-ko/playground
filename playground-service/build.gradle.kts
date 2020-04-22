plugins {
    id("org.springframework.boot")
    kotlin("plugin.spring")
}

java.sourceCompatibility = JavaVersion.VERSION_11

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation("org.springframework.boot:spring-boot-starter-jersey") {
        implementation("jakarta.activation:jakarta.activation-api")
    }
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    implementation(project(":playground-api"))

    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
}
