plugins {
    kotlin("multiplatform")
    `kotlin-conventions`
    `publish-conventions`
}

dependencies {
    jsMainApi(project(":kotlin-mui-system"))
    jsMainApi(project(":kotlin-popper"))

    jsMainApi(npmv("@mui/base"))
}
