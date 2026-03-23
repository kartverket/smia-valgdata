plugins {
    kotlin("jvm") version "2.3.20"
    kotlin("plugin.spring") version "2.3.10"
    id("org.springframework.boot") version "4.0.4"
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
val SPRINGDOC_OPENAPI_VERSION = "3.0.2"
val MICROMETER_PROMETHEUS_VERSION = "1.16.4"
val LOGSTASH_VERSION = "9.0"
val GOOGLE_CLOUD_STORAGE_VERSION = "2.64.0"

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-webmvc")
    implementation("tools.jackson.module:jackson-module-kotlin")
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
