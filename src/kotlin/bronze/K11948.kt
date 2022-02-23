import java.util.*

fun main() {

    val bf = System.`in`.bufferedReader()

    var arr = IntArray(4)

    arr[0] = bf.readLine().toInt()
    arr[1] = bf.readLine().toInt()
    arr[2] = bf.readLine().toInt()
    arr[3] = bf.readLine().toInt()

    var b = bf.readLine().toInt()
    var c = bf.readLine().toInt()

    Arrays.sort(arr)
    var sum = arr[1] + arr[2] + arr[3] + Math.max(b, c)
    println(sum)

}