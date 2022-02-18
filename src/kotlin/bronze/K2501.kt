import java.util.*

fun main() {
    val br = System.`in`.bufferedReader()

    val st = StringTokenizer(readLine(), " ")

    var n = st.nextToken().toInt()
    var m = st.nextToken().toInt()

    for(i in 1..n) {
        if(n%i == 0)
            m--
        if(m == 0) {
            println(i)
            break;
        }
    }

    if(m != 0)
        println(0)
}