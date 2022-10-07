import java.text.SimpleDateFormat
import java.util.*

fun main() {

//    davaleba1
    val array = davaleba1(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14))
    println(array)

//    davaleba2
    PalindromeCheck("aDAFA")

//    davaleba3
    val date = Date()
    val dateToString = date.formatToString("yyyy-MM-dd")
    println(dateToString)
}

fun davaleba1(array: Array<Int>): Int {
    var jami: Int = 0
    var raodenoba: Int = 0
    array.forEachIndexed { i, element ->
        if (i % 2 == 0) {
            jami += element
            raodenoba += 1
        }
    }
    return jami / raodenoba
}


fun PalindromeCheck(value: String): Boolean {
    var result: Boolean = true
    for (i in value.length - 1 downTo 0) {
        if (value[i] != value[value.length - 1 - i]) {
            result = false
            println("$value is not palindrome")
            break
        }
    }
    if (result == true) {
        println("$value is palindrome")
    }
    return result
}


fun Date.formatToString(format: String): String {
    val formatter = SimpleDateFormat(format, Locale.getDefault())
    return formatter.format(this)

}
















