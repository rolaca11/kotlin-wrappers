plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
    karakum()
}

dependencies {
    jsMainApi(project(":kotlin-node"))
    jsMainImplementation(kotlinxCoroutines("core"))

    jsMainApi(devNpmv("@types/express"))
}
