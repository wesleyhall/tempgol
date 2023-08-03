plugins {
    id("java")
    id("application")
}

group = "dev.connolly.darragh"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter-api")
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("org.mockito:mockito-core:5.4.0")
    testImplementation("org.mockito:mockito-junit-jupiter:5.4.0")
}

application {
    mainClass = "dev.connolly.darragh.life.Main"
}

tasks.test {
    useJUnitPlatform()
}