plugins {
    kotlin("jvm") version "1.3.0"
}

dependencies {
    compile(kotlin("stdlib"))
    compile(kotlin("reflect"))
    implementation(gradleApi())
}

repositories {
    jcenter()
}

