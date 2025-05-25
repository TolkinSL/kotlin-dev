//форматирование строк

fun main() {
    print("Input your name ")
    val input = readln()
    if (input == "") println("Пустая строка \$ \"\"") else println(input)
    val name = if (input.isNotBlank()) input else "Kotlin"
    println("Hello $name!")
    println("Hello length ${name.length}")
    println("Hello if ${if (input.isNotBlank()) input else "Someone"}")
}