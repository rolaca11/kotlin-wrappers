import org.gradle.api.Project

fun Project.kotlinxHtml(name: String): String =
    kotlinx("kotlinx-html", name)

fun Project.kotlinxSerialization(name: String): String =
    kotlinx("kotlinx-serialization", name)

fun Project.kotlinxCoroutines(name: String): String =
    kotlinx("kotlinx-coroutines", name)

private fun Project.kotlinx(projectName: String, name: String): String =
    "org.jetbrains.kotlinx:$projectName-$name:${version(projectName)}"

fun Project.seskarCore(): String =
    "io.github.turansky.seskar:seskar-core:${version("seskar")}"
