fun main() {
    val inputName = "Input your \"name\": "
    print(inputName)
    val userName = readln()
    print("Input your \"age\": ")
    val userAge = readln();
    println("User name: $userName, age: $userAge")
    print("Input your gender: ")
    val userGender = readln()
    print("Input your weight: ")
    val userWeight = readln()
    println("User sex: $userGender, \nweight: $userWeight")
    println("------------")
    print("Введите вашу оценку товара: ")
    val stars = readln()
    print("Введите ваш комментарий: ")
    val comment = readln()
    println("Спасибо за ваш выбор!\nОценка пользователя: $stars\nКомментарий пользователя: $comment")
}