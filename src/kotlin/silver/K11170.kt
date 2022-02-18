import java.util.*

val bf = System.`in`.bufferedReader()

fun main() {
    val sb = StringBuffer()

    var t = bf.readLine().toInt()

    while(t-- > 0) {
        val st = StringTokenizer(bf.readLine())

        var cnt = 0

        val n = st.nextToken().toInt()
        val m = st.nextToken().toInt()

        for(i in n..m) {
            val temp = i.toString()
            for(c in temp.toCharArray()) {
                if(c == '0')
                    cnt++
            }
        }

        sb.append(cnt).append("\n")
    }
    println(sb)
}