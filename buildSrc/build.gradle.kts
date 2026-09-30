plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal()
    mavenCentral()
}

dependencies {
    // 트랙 A 를 Kotlin 으로도 풀 수 있도록 컨벤션 플러그인에서 Kotlin JVM 플러그인을 적용한다.
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:2.3.21")
}
