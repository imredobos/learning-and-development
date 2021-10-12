plugins {
  kotlin("jvm") version "1.3.41"
  application
  jacoco
}

repositories {
  mavenCentral()
  jcenter()
}
val test by tasks.getting(Test::class) {
  useJUnitPlatform {}

  testLogging.showStandardStreams = true
}

dependencies {
  implementation(kotlin("stdlib"))
  implementation(kotlin("reflect:1.3.41"))
  implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.2.2")
  implementation("com.beust:klaxon:5.0.2")

  testImplementation("io.kotlintest:kotlintest-runner-junit5:3.3.1")
  testImplementation("io.mockk:mockk:1.9")
}

tasks {
  getByName<JacocoReport>("jacocoTestReport") {
      afterEvaluate {
          setClassDirectories(files(classDirectories.files.map {
              fileTree(it) { exclude("**/ui/**") }
          }))
      }
  }
}

jacoco {
  toolVersion = "0.8.3"
}

application {
  mainClassName = "com.agiledeveloper.ui.AirportAppKt"
}

defaultTasks("clean", "test", "jacocoTestReport")
