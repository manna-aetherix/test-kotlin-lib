plugins {
    kotlin("jvm") version "1.9.22"
    `maven-publish`
    signing
}

group = "io.github.manna-aetherix"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

kotlin {
    jvmToolchain(21)
}

java {
    withSourcesJar()
    withJavadocJar()
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])

            pom {
                name.set("Test Kotlin Library")
                description.set("A simple Kotlin utility library")
                url.set("https://github.com/manna-aetherix/test-kotlin-lib")

                licenses {
                    license {
                        name.set("Apache-2.0")
                        url.set("https://www.apache.org/licenses/LICENSE-2.0")
                    }
                }

                developers {
                    developer {
                        id.set("manna-aetherix")
                        name.set("Manna")
                        email.set("manna.aetherix@email.com")
                    }
                }

                scm {
                    url.set("https://github.com/manna-aetherix/test-kotlin-lib")
                }
            }
        }
    }
}
