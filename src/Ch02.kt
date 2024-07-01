/*
 * 2024.07.01 - ch02 코드 자료
 *
 * Null 처리 잘해야 한다. ; 시스템 안정도에 영향 미친다.
 * Debuggin 중요하다.
 * 출력된 걸 맹신하지 말라. - 오류 발생 전까지 출력된다. ; Debuggin 으로 확인
 * 분산 = E(X^2) - {E(X)}^2
 */

/*
// p.48 - Kotlin for-in, downTo 반복문
fun main() {
    for (i in 10 downTo 1) {
        print("$i ")
    }
    println()

    for (i in 10 downTo 1 step 3) { // -3 감소
        print("$i ")
    }
    println()
}
 */

/*
// p.49 - Kotlin forEach 반복문
fun main() {
    val fruits = listOf("apple", "banana", "kiwi")
    val animals = listOf("tiger", "lion", "bear", "cat", "dog", "panda", "elephant")

    println("List of fruits : ")
    fruits.forEach(::println) // 한 줄에 하나
    println()

    println("List of animals : ")
    animals.forEach { item -> print("%5s ".format(item)) }  // 한 줄에 전부
    println()
}
*/

/*
// p.55 - 2차원 배열 (행렬)
fun print2DArray(mtrx: Array<DoubleArray>) { // Double 형 배열 원소 출력
    for (row in mtrx) {
        for (element in row) {
            print("%5.1f".format(element))
        }
        println()
    }
}

fun main() {
    val rows = 3
    val cols = 4

    // double 형 2차원 배열
    var double_mtrx = Array(rows) { DoubleArray(cols) }
    double_mtrx = arrayOf(
        doubleArrayOf(0.0, 0.1, 0.2, 0.3),
        doubleArrayOf(1.0, 1.1, 1.2, 1.3),
        doubleArrayOf(2.0, 2.1, 2.2, 2.3)
    )
    println("2D Array of Double : ")
    print2DArray(double_mtrx)
    println()

    // string 형 2차원 배열
    val string_mtrx: Array<Array<String>> = arrayOf(
        arrayOf("Apple", "Banana", "Cherry"),
        arrayOf("Dog", "Elephant", "Fox"),
        arrayOf("1", "2", "3", "4")
    )
    println("2D Array of Double : ")
    for (row in string_mtrx) {
        for (element in row) {
            print("$element\t")
        }
        println()
    }
    println()


    // int 형 2차원 배열
    val int_mtrx: Array<IntArray> = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9),
    )
    println("2D Array of Integer : ")
    for (row in int_mtrx) {
        for (element in row) {
            print("$element\t")
        }
        println()
    }
    println()

}
*/