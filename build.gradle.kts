plugins {
    kotlin("jvm") version "1.8.10"
    application
}


repositories {
    mavenCentral()
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-compiler-embeddable:1.8.10")
    testImplementation(kotlin("test"))
}
