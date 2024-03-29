
plugins {
    id("java")
    id("org.graalvm.buildtools.native") version "0.10.1"
}

group = "org.example"
version = "1.0-SNAPSHOT"

val mainClassPath = "org.example.Main"

tasks.jar {
    // simple for a jar can run
    manifest.attributes += Pair("Main-Class", mainClassPath)
}

graalvmNative {
//    toolchainDetection.set(true)
    binaries {
        named("main") {
            mainClass.set(mainClassPath)
            buildArgs.add("--enable-preview")
        }
    }
}

java.toolchain {
    languageVersion = JavaLanguageVersion.of(22)
}

tasks.compileJava {
    options.compilerArgs.add("--enable-preview")
}

tasks.withType<JavaExec> {
    jvmArgs("--enable-preview")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}