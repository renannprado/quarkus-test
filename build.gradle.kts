plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin on the JVM.
    id("org.jetbrains.kotlin.jvm") version("1.3.21")
    id("io.quarkus") version "0.13.1"
    // Apply the application plugin to add support for building a CLI application.
//    application
    idea
}

repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    mavenCentral()

    maven(
        // this is temporary, all dependencies should be in central soon
        url = "http://repository.jboss.org/nexus/content/groups/public"
    )
}

dependencies {
//    implementation(platform("io.quarkus:quarkus-bom:0.13.1"))
    implementation("io.quarkus:quarkus-resteasy:0.13.1")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("io.quarkus:quarkus-arc:0.13.1")
    implementation("io.quarkus:quarkus-resteasy-jsonb:0.13.1")
    implementation("io.quarkus:quarkus-kotlin:0.13.1")
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")

    implementation("org.jetbrains.intellij.deps:trove4j:1.0.20181211")
    implementation("org.jetbrains.kotlin:kotlin-script-runtime:1.3.21")
}

//application {
//     Define the main class for the application.
//    mainClassName = "quarkus.test.AppKt"
//}

quarkus {
    setSourceDir("src/main/kotlin")
    setOutputDirectory("build/classes/kotlin/main")
}