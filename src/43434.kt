fun main() {
    main1()
    task2()
}
fun main1(){
    val t: Int = readLine()!!.toInt()
    val e: String = readLine()!!
    val x: Int = readLine()!!.toInt()
    calculate(t,x,e)
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


    }
