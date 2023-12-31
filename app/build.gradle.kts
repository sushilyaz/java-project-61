import org.gradle.internal.impldep.org.glassfish.jaxb.core.api.impl.NameConverter.Standard
import java.io.InputStream;
plugins {
    id("java")
    application
    checkstyle
}
application {
    mainClass = "hexlet.code.App"
}
group = "hexlet.code"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

tasks.withType<JavaCompile> {
    options.release.set(20)
}


dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.puppycrawl.tools:checkstyle:10.12.4")
}

tasks.test {
    useJUnitPlatform()
}
