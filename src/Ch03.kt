/*
 * 2024.07.02 - ch03 코드 자료
 *
 * 함수 내 지역 변수 우선
 * 전역 변수 웬만하면 쓰지 말 것 ; 안 써도 프로그래밍 가능함
 * 함수 반환형 ; 하나
 * 여러 개를 전달하고 싶다 => data class 사용하여 전달 (구조체 같은 애)
 * measureTimeMillis{} ; 중괄호 안에 있는 기능 실행 시간 측정
 * 탐색 시 고려 사항 - 정렬된 상태인지 아닌지
 * 순차 탐색 ; 정렬 x, 내가 찾는 것 제일 뒤 => 시간 오래 걸림 // 장점 : 정렬 안 해도 됨 // 단점 : 시간
 * 이진 탐색 ; 정렬 o, 순차 탐색보다 탐색 시간 더 짧게 걸림 // 장점 : 순차 탐색보다 성능이 좋고 빠름 // 단점 : 정렿해야 함
 * (예 : n = 1024 => 순차 탐색 (N / 2 = 512), 이진 탐색 (log2(n) = log2(1024) = 10))
 * 정렬 방법 ; 선택 정렬, 삽입 정렬, 병합 정렬, 퀵 정렬
 * 단순 반복 구조 ; 선택 정렬, 삽입 정렬 // 3만 개 미만 // 모든 걸 고려해서 정렬해야 함
 * 분할 및 정복 구조 ; 병합 정렬, 퀵 정렬 // 3만 개 이상 무조건 // 모든 걸 고려할 필요 x (분할 처리 => pivot value 기준 작은 조, 큰 조로 나뉨)
 * 배열 크기가 작을 때 퀵 정렬보다는 삽입 정렬이 더 빠름 (배열 크기 = 10 정도?)
 * 배열 크기가 50 이상일 때 퀵 정렬이 빠름
 *
 * 컴퓨터 구조에 따라 실행 시간이 달라져 => 실무에서는 다 실행해서 확인해 봐야 함
 *
 * 시현할 때 메뉴 형식으로 처리
 *
 * 1. 분할 및 정복으로 계산
 * 2. 동적 프로그래밍으로 계산
 *
 * 예외 처리
 * 1. 0 으로 나눌 때
 * 2. 배열 범위 벗어났을 때 : index number
 * 3. 파일 이름 잘못 입력하거나 파일이 존재하지 않을 때
 * 4. nextInt(), nextDouble() 같은 거 잘못 쓸 때
 * 등
 * => try-catch-finally 구조로 예외 처리
 * => catch 부분에서 Exception 처리
 * => finally 부분 ; 예외 발생했든 안 했든 실행
 *
 */

import java.util.*
import kotlin.math.min
import kotlin.system.*

/*
// p.11 - 피보나치
val FIBO_MAX = 1000
fun Fibo_SR(n: Int): Double { // 단순 재귀 - overflow 발생 안 하게 Double
    if (n < 0) {
        println("Error in Fibonacci series, given n (%d) is negative!".format(n))
    }

    if ((n >= 0) && (n <= 1)){
        return n.toDouble()
    } else {
        var fibo_n = Fibo_SR(n - 2) + Fibo_SR(n - 1)

        return fibo_n
    }
}

var fibo_tbl: DoubleArray = DoubleArray(FIBO_MAX + 1){-1.0}
fun Fibo_Dyn(n: Int): Double { // 동적 피보나치
    if (n > FIBO_MAX) {
        println ("Exception in Fibo_Dyn - given n (%d) is beyond the FIBO_MAX (%d)".format(n, FIBO_MAX))

        return -1.0
    }

    if ((n >= 0) && (n <= 1)) {
        return n.toDouble()
    } else if (fibo_tbl[n] != -1.0) {
        return fibo_tbl[n]
    } else {
        var fibo_n = Fibo_Dyn(n - 1) + Fibo_Dyn(n - 2)
        fibo_tbl[n] = fibo_n

        return fibo_n
    }
}

fun main() {
    val cin = Scanner(System.`in`)
    print("Input range (Start, end (upto %d), step) of Fibonacci series : ".format(FIBO_MAX))

    val start = cin.nextInt()
    val end = cin.nextInt()
    val Fibo_step = cin.nextInt()

    print("By Simple Recursive (SR) Or Dynamic programming (Dyn) : ")
    var mode = cin.next()
    var fibo_n: Double
    var tms_fibo: Long

    if (mode == "SR") {
        println("Fibonacci Series (by Simple Recursive)")

        for (n in start..end step Fibo_step) {
            tms_fibo = measureTimeMillis {
                fibo_n = Fibo_SR(n)
            }

            println("%3d-th Fibo_n = %25.0f (took %8d msec)".format(n, fibo_n, tms_fibo))
        }
    } else { // mode == Dyn
        println("Fibonacci Series (by Dynamic Recursive)")

        for (n in start..end step Fibo_step) {
            tms_fibo = measureTimeMillis {
                fibo_n = Fibo_Dyn(n)
            }

            println("%3d-th Fibo_n = %25.0f (took %8d msec)".format(n, fibo_n, tms_fibo))
        }
    }

    cin.close()
}
 */
/*
// p.22 - 순차 탐색
fun sequential_search(array: IntArray, key_to_search: Int): Int {
    val size = array.size
    for (i in 0..<size) {
        if (array[i] == key_to_search)
            return i
    }

    return -1 // 못 찾았다
}

// p.32 - 정렬
fun selection_sort(array: IntArray) { // 선택 정렬
    for (i in 0..< array.size) {
        var min_index = i
        for (j in i + 1..< array.size) {
            if (array[min_index] > array[j]) {
                min_index = j // i 아님
            }
        }

        if (min_index != i) {
            var temp = array[i]
            array[i] = array[min_index]
            array[min_index] = temp
        }
    }
}

fun insertion_sort(array: IntArray) { // 삽입 정렬
    var k = 1
    while (k < array.size) {
        var temp = array[k]
        var i = k
        while (i > 0) {
            if (array[i - 1] >= temp) {
                break
            }
            array[i] = array[i - 1]
            i--
        }
        array[i] = temp
        k++
    }
}

fun print_array(array:IntArray) { // 출력
    for (i in 0..< array.size) {
        print("%3d".format(array[i]))
    }
    println()
}

fun get_int_array(cin: Scanner, array: IntArray) {
    for(i in 0..< array.size) {
        array[i] = cin.nextInt()
    }
}

fun shuffle_big_int_array(array: IntArray) { // 원소 섞음
    for (i in 0..< array.size) {
        val j = (Math.random() * array.size).toInt()
        if (j == i)
            continue

        val temp = array[i]
        array[i] = array[j]
        array[j] = temp
    }
}

fun gen_big_rand_int_array(size: Int, offset: Int): IntArray { // 중복 x 엄청 큰 정수 배열 생성
    val bigIntArray = IntArray(size)
    for (i in 0..< size) {
        bigIntArray[i] = i + offset
    }

    shuffle_big_int_array(bigIntArray)

    return bigIntArray
}
*/



