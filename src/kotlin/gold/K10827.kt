import java.math.BigDecimal
import java.util.*

fun main() {

    val bf = System.`in`.bufferedReader()

    val st = StringTokenizer(readLine(), " ");

    var a = BigDecimal(st.nextToken())
    var b = st.nextToken().toInt()

    println(a.pow(b).toPlainString())

}