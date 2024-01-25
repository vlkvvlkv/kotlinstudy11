fun main() {
    val t: Int = readLine()!!.toInt()
    val e: String = readLine()!!
    val x: Int = readLine()!!.toInt()
calculate(t,x,e)

}
fun calculate(num1: Int, num2: Int, operand: String){
    when(operand) {
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