//Камень-Ножницы-Бумага (три события)
//Создать консольную игру "Камень-Ножницы-Бумага" (три события).
// На консоль выводится выбор компьютера (случайное значение) и выбор игрока. Для ускорения ввода выбора игрока можно условиться,
// что, например, 1 - это камень, 2 - ножницы, 3 - бумага.
// Выполненное задание представить в виде ссылки на GitHub
//Победитель определяется по следующим правилам:
//Бумага побеждает камень («бумага обёртывает камень»).
//Камень побеждает ножницы («камень затупляет или ломает ножницы»).
//Ножницы побеждают бумагу («ножницы разрезают бумагу»).
//Если игроки показали одинаковый знак, то засчитывается ничья и игра переигрывается.

fun main() {
    println("Камень-ножницы-бумага")
    println("Выберите оружие: \n 1-Камень \n 2-Ножницы\n 3-Бумага")
    var user = readLine()!!.toInt()
    while (user < 1 || user > 3)//провекра на праивльность ввода
    {
        println("Ошибка! Введите правильное значение")
        user = readLine()!!.toInt()
    }
    when (user) {
        1 -> println("Вы выбрали 'Камень'")
        2 -> println("Вы выбрали 'Ножницы'")
        3 -> println("Вы выбрали 'Бумагу'")
    }
    val numbers = listOf(1, 2, 3)
    val computer = numbers.random()//выбор компьютера
    when (computer) {
        1 -> println("Компьютер выбрал 'Камень'")
        2 -> println("Компьютер выбрал 'Ножницы'")
        3 -> println("Компьютер выбрал 'Бумагу'")
    }
    println()
    if (user == 1 && computer == 2)
        println("Камень побеждает ножницы («камень затупляет или ломает ножницы») \nВы выиграли!😁")
    else if (user == 2 && computer == 1)
        println("Камень побеждает ножницы («камень затупляет или ломает ножницы») \nВы проиграли 😥")
    else if (user == 3 && computer == 1)
        println("Бумага побеждает камень («бумага обёртывает камень»)\nВы выиграли!😁")
    else if (user == 1 && computer == 3)
        println("Бумага побеждает камень («бумага обёртывает камень»)\nВы проиграли 😥")
    else if (user == 2 && computer == 3)
        println("Ножницы побеждают бумагу («ножницы разрезают бумагу») \nВы выиграли!😁")
    else if (user == 3 && computer == 2)
        println("Ножницы побеждают бумагу («ножницы разрезают бумагу»)\nВы проиграли 😥")
    else if (user == 1 && computer == 1) {
        println("Ничья, попробуйте еще раз\n")
        main()
    }
    else if (user == 2 && computer == 2) {
        println("Ничья, попробуйте еще раз\n")
        main()
    }
    else if (user == 3 && computer == 3) {
        println("Ничья, попробуйте еще раз\n")
        main()
    }

}