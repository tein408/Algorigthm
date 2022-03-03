fun main() {

    val bf = System.`in`.bufferedReader()
    var a = bf.readLine().toInt()
    var b = bf.readLine().toInt()
    var c = bf.readLine().toInt()

    if(a == b && b == c && a == 60)
        println("Equilateral")
    else if((a + b + c) == 180) {
        if(a == b || a == c || b == c)
            println("Isosceles")
        else
            println("Scalene")
    }
    else
        println("Error")

}