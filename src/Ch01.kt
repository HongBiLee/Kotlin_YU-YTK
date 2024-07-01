// ch01 코드 자료

import java.util.*

/*
// p.26
fun main(args: Array<String>) {
    println("Hello, World! \n")

    var name = "Hong, Gil-Dong"
    var st_id = 12345678
    println("Student(Name = $name; ST_ID = $st_id")
    println("Student(Name = %15s; ST_ID = %8d)".format(name, st_id))
}
 */

/*
// p.27
fun addInt(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>){
    val cin = Scanner(System.`in`)
    var x: Int
    var y: Int
    var sum: Int
    while (true) {
        print("Enter two integers (0 0 to quit) : ")
        x = cin.nextInt()
        y = cin.nextInt()

        if ((x == 0) && (y == 0))
            break

        sum = addInt(x, y)
        println("%d + %d = %d".format(x, y, sum))
    }

}
 */

/*
// p.41
fun main(args: Array<String>) {
    val cin = Scanner(System.`in`)
    while(true) {
        print("\nEnter 2 double data in a line (0 0 to quit) : ")
        val x = cin.nextDouble()
        val y = cin.nextDouble()

        if ((x.equals(0.0)) && (y.equals(0.0)))
            break

        println("x(%7.3f) + y(%7.3f) = %7.3f".format(x, y, x + y))
        println("x(%7.3f) - y(%7.3f) = %7.3f".format(x, y, x - y))
        println("x(%7.3f) * y(%7.3f) = %7.3f".format(x, y, x * y))
        println("x(%7.3f) / y(%7.3f) = %7.3f".format(x, y, x / y))
    }
}
 */

/*
// p.52
fun main(args: Array<String>) {
    println("9 x 9 Multiplication Table")
    print("   |")

    for (i in 1..9)
        print("%3d".format(i))

    println()
    print("---+")

    for (i in 1..9)
        print("---")

    println()

    for (i in 1..9) {
        print("%3d|".format(i))

        for (j in 1..9) {
            print("%3d".format(i * j))
        }

        println()
    }
}
 */

/*
// p.55
fun printArray(arr: IntArray) {
    val size = arr.size
    for (i in 0..size-1)
        print("%3d".format(arr[i]))

    println()
}

fun insertionSort(arr: IntArray) {
    val size = arr.size
    for (i in 1..size-1){
        val key = arr[i]
        var j = i
        while (j > 0) {
            if (arr[j - 1] <= key)
                break
            arr[j] = arr[j - 1]
            j--
        }
        arr[j] = key
    }
}

fun main() {
    val intArray = IntArray(10)
    val cin = Scanner(System.`in`)
    var data: Int
    print("Enter 10 integers : ")
    for (i in 0..9) {
        data = cin.nextInt()
        intArray[i] = data
    }

    print("Input data before Sorting : ")
    printArray(intArray)

    insertionSort(intArray)

    print("Input data after Sorting :")
    printArray(intArray)
}
 */

/*
// p.56

fun Fibo(n: Int): Int { // 정적 피보나치 계산 함수
    var fibo_n: Int
    if (n <= 1) {
        fibo_n =  n
    } else {
        fibo_n = Fibo(n - 2) + Fibo(n -1)
    }

    return fibo_n
}

fun main() {
    val cin = Scanner(System.`in`)
    print("Input n to generate Fibonacci Series (0 ~ n) : ")
    val n = cin.nextInt()
    var fibo_i: Int
    for (i in 0..n) {
        fibo_i = Fibo(i)
        print("Fibo(%3d) = %20d\n".format(i, fibo_i))
    }
    cin.close()
}
 */