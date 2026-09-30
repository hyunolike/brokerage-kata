plugins {
    java
    id("org.springframework.boot") version "3.5.16"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "kata"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-validation")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa")
    implementation("org.springframework.boot:spring-boot-starter-data-redis")
    // 아래는 spec 을 진행하며 plan 에서 결정하고 추가한다. (선택 근거는 ADR)
    // 003 분산락:   implementation("org.redisson:redisson-spring-boot-starter:<version>")
    // 007 이벤트:   implementation("org.springframework.kafka:spring-kafka")
    //              testImplementation("org.springframework.kafka:spring-kafka-test")
    // 005/007 테스트 인프라: testImplementation("org.springframework.boot:spring-boot-testcontainers")
    //              testImplementation("org.testcontainers:junit-jupiter") (+ mysql / kafka 모듈)
    // 009 관측성:   implementation("org.springframework.boot:spring-boot-starter-actuator")
    //              runtimeOnly("io.micrometer:micrometer-registry-prometheus")

    runtimeOnly("com.h2database:h2")
    runtimeOnly("com.mysql:mysql-connector-j")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
    // 아키텍처 규칙을 테스트로 강제한다 (ADR-0000, acceptance/Stage1ArchitectureTest)
    testImplementation("com.tngtech.archunit:archunit-junit5:1.5.1")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
}

tasks.withType<JavaCompile>().configureEach {
    options.encoding = "UTF-8"
    options.compilerArgs.add("-parameters")
}

tasks.withType<Test>().configureEach {
    useJUnitPlatform()
    testLogging {
        events("passed", "skipped", "failed")
    }
}
