package Ch08

import java.util.*

class IntArraySorting {

    fun selection_sort(array: IntArray) { // 선택 정렬
        for (i in 0..< array.size) {
            var min_index = i
            for (j in i + 1..< array.size) {
                if (array[min_index] > array[j]) {
                    min_index = j
                }
            }

            if (min_index != i) {
                var temp = array[i]
                array[i] = array[min_index]
                array[min_index] = temp
            }
        }
    }

    fun insertion_sort_DESC(array: IntArray) { // 삽입 정렬 - 내림차순
        var k = 1
        while (k < array.size) {
            var temp = array[k]
            var i = k
            while (i > 0) {
                if (array[i - 1] >= temp) { // if array[i - 1] <= temp ; 오름차순으로 정렬됨
                    break
                }
                array[i] = array[i - 1]
                i--
            }
            array[i] = temp
            k++
        }
    }

    fun insertion_sort_ASC(array: IntArray) { // 삽입 정렬 - 오름차순
        var k = 1
        while (k < array.size) {
            var temp = array[k]
            var i = k
            while (i > 0) {
                if (array[i - 1] <= temp) { // if array[i - 1] => temp ; 내림차순으로 정렬됨
                    break
                }
                array[i] = array[i - 1]
                --i
            }
            array[i] = temp
            k++
        }
    }

    fun _mergeSort(array: IntArray, tmp_array: IntArray, left: Int, right: Int) { // 병합 정렬 내부 함수
        if (left >= right)
            return

        var mid = (left + right) / 2
        _mergeSort(array, tmp_array, left, mid)
        _mergeSort(array, tmp_array, mid + 1, right)

        // 1단계 ; tmp_array 에 배열 복사
        for (i in left..mid)
            tmp_array[i] = array[i]

        for (j in 1..right - mid)
            tmp_array[right - j + 1] = array[mid + j]

        // 2단계
        var i = left
        var k = left
        var j = right
        while (k <= right) {
            if (tmp_array[i] < tmp_array[j])
                array[k] = tmp_array[i++]
            else
                array[k] = tmp_array[j--]

            k++
        }
    }

    fun mergeSort(array: IntArray) { // 병합 정렬
        var tmp_array = array.copyOf()

        _mergeSort(array, tmp_array, 0, array.size - 1)
    }

    fun _partition(array: IntArray, left: Int, right: Int, pivotIndex: Int): Int { // 퀵 정렬 - 분할
        var pivotValue = array[pivotIndex]
        array[pivotIndex] = array[right]
        array[right] = pivotValue

        var newPI = left // new Pivot Index
        var i = left
        var temp: Int
        while (i <= right - 1) {
            if (array[i] <= pivotValue) {
                temp = array[i]
                array[i] = array[newPI]
                array[newPI] = temp
                newPI = newPI + 1
            }

            i++
        }

        temp = array[newPI]
        array[newPI] = array[right]
        array[right] = temp

        return newPI
    }

    fun _quickSort(array: IntArray, left: Int, right: Int) { // 퀵 정렬 내부 함수
        if (left >= right)
            return

        var pi = (left + right) / 2
        var newPI = _partition(array, left, right, pi)

        if (left < (newPI - 1)) {
            _quickSort(array, left, newPI - 1)
        }

        if ((newPI + 1) < right) {
            _quickSort(array, newPI + 1, right)
        }
    }

    fun quickSort(array: IntArray)
    { // 퀵 정렬
        _quickSort(array, 0, array.size - 1)
    }

    fun print_array(array:IntArray)
    { // 출력
        for (i in 0..< array.size)
        {
            print("%3d".format(array[i]))
        }
        println()
    }

    fun get_int_array(cin: Scanner, array: IntArray)
    {
        for(i in 0..< array.size)
        {
            array[i] = cin.nextInt()
        }
    }

    fun shuffle_big_int_array(array: IntArray)
    { // 원소 섞음
        for (i in 0..< array.size)
        {
            val j = (Math.random() * array.size).toInt()
            if (j == i)
                continue

            val temp = array[i]
            array[i] = array[j]
            array[j] = temp
        }
    }

    fun gen_big_rand_int_array(size: Int, offset: Int): IntArray
    { // 중복 x 엄청 큰 정수 배열 생성
        val bigIntArray = IntArray(size)
        for (i in 0..< size)
        {
            bigIntArray[i] = i + offset
        }

        shuffle_big_int_array(bigIntArray)

        return bigIntArray
    }

}