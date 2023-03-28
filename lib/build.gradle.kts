plugins {
    `java-library`
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.testng:testng:7.7.0")
    testImplementation("io.cucumber:cucumber-guice:7.11.2")
    testImplementation("io.cucumber:cucumber-java:7.11.2")
    testImplementation("io.cucumber:cucumber-testng:7.11.2")

    implementation("com.google.inject:guice:5.1.0")
}

tasks.named<Test>("test") {
    useTestNG(closureOf<TestNGOptions> {
        suites("src/test/resources/testng.xml")
        isScanForTestClasses = false
    })
}
