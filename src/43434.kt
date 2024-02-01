import java.lang.Exception

fun main() {
    main1()
    task2()
}

fun main1() {
    while (true) {
    try {
        val t: Int = readLine()!!.toInt()
        val e: String = readLine()!!
        val x: Int = readLine()!!.toInt()
        calculate(t, x, e)
    } catch (e: NumberFormatException) {
        print("Введено не число")
    } catch (e: Exception) {

    }
        print(", продолжить? ")
        var p = readLine()
        if(p == "нет")
            break
}
}

fun calculate(num1: Int, num2: Int, operand: String) {
    when (operand) {
        "+" -> {
            var r = num1 + num2
            print("$num1 + $num2 = ${num1 + num2}")
        }
        "-" -> print("$num1 + $num2 = ${num1 - num2}")
        "*" -> print("$num1 + $num2 = ${num1 * num2}")
        "/" -> print("$num1 + $num2 = ${num1 / num2}")
        else -> print("Введено неккоректное число")
    }
}

fun task2() {
    val list: List<Int> = listOf(23, 34)
    val numberlist: MutableList<Int> = mutableListOf()
    numberlist.add(33)
    val eq: Map<Int, Int> = mapOf()
    val rq: HashMap<Int, Int> = hashMapOf()
}

fun main2() {

}


