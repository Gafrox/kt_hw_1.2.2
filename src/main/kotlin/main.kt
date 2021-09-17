fun main() {
    val likes = 61
    val string1 = "людям"
    val string2 = "человеку"
    val output = if (likes % 100 !== 11 && likes % 10 == 1) string2 else string1
    println("Понравилось $likes $output")
}