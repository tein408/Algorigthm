import java.util.*

fun main() {

    val bf = System.`in`.bufferedReader()

    var arr = Array<String>(5){""}

    for(i in 0..4) {
        arr[i] = bf.readLine()
    }

    var re = ""

    var a = arr[0].length
    var b = arr[1].length
    var c = arr[2].length
    var d = arr[3].length
    var e = arr[4].length

    for(i in 0..15) {
        if(i<a)
            re += arr[0][i]
        if(i<b)
            re += arr[1][i]
        if(i<c)
            re += arr[2][i]
        if(i<d)
            re += arr[3][i]
        if(i<e)
            re += arr[4][i]
    }

    println(re)


}