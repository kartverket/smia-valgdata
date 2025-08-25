plugins {
    kotlin("jvm") version "2.2.10"
    kotlin("plugin.spring") version "2.2.10"
    id("org.springframework.boot") version "3.5.4"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "no.kartverket"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

// Dependency versions
val SPRINGDOC_OPENAPI_VERSION = "2.8.11"
val MICROMETER_PROMETHEUS_VERSION = "1.15.3"
val LOGSTASH_VERSION = "8.1"
val GOOGLE_CLOUD_STORAGE_VERSION = "2.55.0"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation("net.logstash.logback:logstash-logback-encoder:$LOGSTASH_VERSION")
    implementation("io.micrometer:micrometer-registry-prometheus:$MICROMETER_PROMETHEUS_VERSION")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-api:$SPRINGDOC_OPENAPI_VERSION")
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:$SPRINGDOC_OPENAPI_VERSION")
    implementation("com.google.cloud:google-cloud-storage:$GOOGLE_CLOUD_STORAGE_VERSION")
    developmentOnly("org.springframework.boot:spring-boot-devtools")
}

kotlin {
    compilerOptions {
        freeCompilerArgs.addAll("-Xjsr305=strict")
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
