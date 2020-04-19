plugins {
    id("org.springframework.boot")
    kotlin("plugin.spring")
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-jersey") {
        implementation("jakarta.activation:jakarta.activation-api")
    }
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")

    implementation(project(":playground-api"))

    testImplementation("org.springframework.boot:spring-boot-starter-test") {
        exclude(group = "org.junit.vintage", module = "junit-vintage-engine")
    }
}
