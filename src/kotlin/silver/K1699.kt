fun main() {

    val bf = System.`in`.bufferedReader()

    var n = bf.readLine().toInt()
    var arr = IntArray(n+1)

    for(i in 1..n) {
        arr[i] = i
        var j = 1
        while(j*j <= i) {
            arr[i] = Math.min(arr[i], arr[i-j*j] + 1)
            j++
        }
    }

    println(arr[n])
}