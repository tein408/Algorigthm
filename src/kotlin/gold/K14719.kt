//kotlin(JVM)

import java.util.*

val br = System.`in`.bufferedReader()

fun main() {

    val st1 = StringTokenizer(readLine(), " ");
    val st2 = StringTokenizer(readLine(), " ");

    var h = st1.nextToken().toInt()
    var w = st1.nextToken().toInt()

    var arr = Array<Int>(w) {st2.nextToken().toInt()}

    var left = 0
    var right = arr.size - 1

    var leftMax = 0
    var rightMax = 0

    var ans = 0

    while(left <= right) {

        if(arr[left] < arr[right]) {
            if(arr[left] >= leftMax)
                leftMax = arr[left]
            else
                ans += leftMax - arr[left]
            left++
        } else {
            if(arr[right] >= rightMax)
                rightMax = arr[right]
            else
                ans += rightMax - arr[right]
            right--
        }

    }

    println(ans)

}