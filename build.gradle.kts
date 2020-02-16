import org.gradle.api.tasks.testing.logging.TestExceptionFormat

plugins {
    java
}

group = "ignacysokolowski"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("junit", "junit", "4.12")
}

tasks {
    withType<Test> {
        testLogging {
            showExceptions = true
            exceptionFormat = TestExceptionFormat.FULL
            events("passed", "skipped", "failed")
        }
    }
}

configure<JavaPluginConvention> {
    sourceCompatibility = JavaVersion.VERSION_1_8
}
