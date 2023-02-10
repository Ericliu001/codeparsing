plugins {
    kotlin("jvm") version "1.8.10"
    application
}


repositories {
    mavenCentral()
    jcenter()

    maven {
        url = uri("https://www.jetbrains.com/intellij-repository/releases/")
    }
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-compiler-embeddable:1.8.10")

//    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:1.8.10")
//    implementation("com.jetbrains.intellij.platform:uast:223.8214.52")
//    implementation("com.jetbrains.intellij.java:java-uast:223.8214.52")
//    runtimeOnly("com.jetbrains.intellij.java:java-psi:223.8214.52")
//    runtimeOnly("com.jetbrains.intellij.java:java-psi-impl:223.8214.52")
//    runtimeOnly("com.jetbrains.intellij.java:java-analysis-impl:223.8214.52")
//    runtimeOnly("com.jetbrains.intellij.java:java-impl:223.8214.52")
//    runtimeOnly("com.jetbrains.intellij.java:java-psi-impl:223.8214.52")


    testImplementation(kotlin("test"))
}
