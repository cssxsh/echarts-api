plugins {
    kotlin("jvm") version "1.6.21"
    kotlin("plugin.serialization") version "1.6.21"
}

group = "xyz.cssxsh.echarts"
version = "1.0.0-dev"

repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    api("org.jetbrains.kotlinx:kotlinx-serialization-json:1.3.3")
    api("org.jetbrains.kotlinx:kotlinx-serialization-protobuf:1.3.3")
    // test
    testImplementation(kotlin("test", "1.6.21"))
    testRuntimeOnly("org.slf4j:slf4j-simple:1.7.36")
}

kotlin {
    explicitApi()
}

tasks {
    test {
        useJUnitPlatform()
    }
}
