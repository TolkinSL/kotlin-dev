fun main() {
    println("Hello Kotlin!")
    println("Max Func")
    println(max1(3, 5))
    println(max2(1, 7))

    //----------------
    println()
    val myBool = false;
    val testBool = if (myBool) 2 else 4
    println("Test if expr_1 - $testBool")

    //----------------
    val question_1: String = "Test string 1"
    val answer_1: Int = 35
    val question_2 = "Test string 2"
    val answer_2 = 37
    val doubleTest = 34.5

    //----------------
    println()
    val result_1: String
    if (canPerform()) {
        result_1 = "Ok"
    } else {
        result_1 = "Not Ok"
    }
    println("Initial \"if\" value $result_1")

    var answer_3 = 34

}

fun max1(a: Int, b: Int): Int {
    return if (a > b) a else b
}

//Alt + Enter for convert
fun max2(a: Int, b: Int): Int = if (a > b) a else b

fun test1(): Int {
    val answer: Int
    answer = 5

    return answer
}

fun canPerform(): Boolean {
    return true
}