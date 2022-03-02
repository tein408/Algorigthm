import java.util.*
import kotlin.math.max

fun main() {

    val bf = System.`in`.bufferedReader()

    val n = bf.readLine().toInt()

    if(n == 1) {
        println(1)
        return
    }

    val st = StringTokenizer(bf.readLine());

    val arr = IntArray(n)
    val dp = IntArray(n) {1}
    var max = 0

    for(i in 0 until n) {
        arr[i] = st.nextToken().toInt()
    }

    for(i in 1 until n) {
        dp[i] = 1
        for(j in 0 until i) {
            if(arr[i] > arr[j]) {
                dp[i] = max(dp[i], dp[j] + 1)
            }
        }
        max = max(max, dp[i])
    }

    println(max)
}