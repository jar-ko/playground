val jakartaWsRsApiVersion: String by project

java.sourceCompatibility = JavaVersion.VERSION_11
java.targetCompatibility = JavaVersion.VERSION_11

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    implementation("jakarta.ws.rs:jakarta.ws.rs-api:${jakartaWsRsApiVersion}")
}
