fun main() {
    var x = 3
    var y = 1

    if (x > y) {
        println("$x (x) is greater than $y (y)")
    } else {
        println("$x (x) IS NOT greather than $y (y)")
    }

    println( if (x >y) "X is > y" else "X is not > y")

     x = 6
     y = 8
    println( if (x > y) x else y)

}