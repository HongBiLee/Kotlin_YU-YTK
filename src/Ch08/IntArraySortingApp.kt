package Ch08

import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis

fun main()
{
    val test_sizes = intArrayOf(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 500, 1000, 5000, 10000)
    val offset = 0

    val intArrSort = IntArraySorting()


    // 정렬 확인
    println("Test Sorting")
    var bigRandIntArr1 = intArrSort.gen_big_rand_int_array(30, offset)

    println("Shuffle")
    intArrSort.shuffle_big_int_array(bigRandIntArr1)
    intArrSort.print_array(bigRandIntArr1)

    // 선택 정렬
    println("\nAfter Selection Sorting")
    intArrSort.selection_sort(bigRandIntArr1)
    intArrSort.print_array(bigRandIntArr1)

    println("\nShuffle")
    intArrSort.shuffle_big_int_array(bigRandIntArr1)
    intArrSort.print_array(bigRandIntArr1)

    // 삽입 정렬 - 내림차순
    println("\nAfter Insertion Sorting (DESC)")
    intArrSort.insertion_sort_DESC(bigRandIntArr1)
    intArrSort.print_array(bigRandIntArr1)

    println("\nShuffle")
    intArrSort.shuffle_big_int_array(bigRandIntArr1)
    intArrSort.print_array(bigRandIntArr1)

    // 삽입 정렬 - 오름차순
    println("\nAfter Insertion Sorting (ASC)")
    intArrSort.insertion_sort_ASC(bigRandIntArr1)
    intArrSort.print_array(bigRandIntArr1)

    println("\nShuffle")
    intArrSort.shuffle_big_int_array(bigRandIntArr1)
    intArrSort.print_array(bigRandIntArr1)

    // 병합 정렬
    println("\nAfter Merge Sorting")
    intArrSort.mergeSort(bigRandIntArr1)
    intArrSort.print_array(bigRandIntArr1)

    println("\nShuffle")
    intArrSort.shuffle_big_int_array(bigRandIntArr1)
    intArrSort.print_array(bigRandIntArr1)

    // 퀵 정렬
    println("\nAfter Quick Sorting")
    intArrSort.quickSort(bigRandIntArr1)
    intArrSort.print_array(bigRandIntArr1)
    println()


    println("Comparisons of Sorting Algorithms (measured time in milli-seconds)")
    println("%10s %15s %15s %15s %15s".format("test_size", "quick_sort[ns]", "merge_sort[ns]", "insert_sort[ms]", "select_sort[ms]"))

    for (test_size in test_sizes)
    {
        bigRandIntArr1 = intArrSort.gen_big_rand_int_array(test_size, offset)
        intArrSort.shuffle_big_int_array(bigRandIntArr1)

        if (test_size > 35)
        { // 선택, 삽입 정렬 x
            var bigRandIntArr2 = bigRandIntArr1.copyOf()

            var tns_quick: Long = measureNanoTime { intArrSort.quickSort(bigRandIntArr1) }
            var tns_merge: Long = measureNanoTime { intArrSort.mergeSort(bigRandIntArr2) }

            println("%10d %15d %15d %15s %15s".format(test_size, tns_quick, tns_merge, "x", "x"))
        }
        else
        { // 선택, 삽입 정렬 o
            var bigRandIntArr2 = bigRandIntArr1.copyOf()
            var bigRandIntArr3 = bigRandIntArr1.copyOf()
            var bigRandIntArr4 = bigRandIntArr1.copyOf()

            var tns_quick: Long = measureNanoTime { intArrSort.quickSort(bigRandIntArr1) }
            var tns_merge: Long = measureNanoTime { intArrSort.mergeSort(bigRandIntArr2) }
            var tms_insert: Long = measureTimeMillis { intArrSort.insertion_sort_ASC(bigRandIntArr3) }
            var tms_select: Long = measureTimeMillis { intArrSort.selection_sort(bigRandIntArr4) }

            println("%10d %15d %15d %15d %15d".format(test_size, tns_quick, tns_merge, tms_insert, tms_select))
        }
    }
}
