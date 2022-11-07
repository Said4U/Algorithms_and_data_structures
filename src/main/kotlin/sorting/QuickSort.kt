package sorting

import kotlin.random.Random

/**
 * quicksort algorithm
 *
 * worst time: n²
 * the best time: n * log(n)
 * average time: n * log(n)
 *
 * amount of memory: n
 */


fun <T : Comparable<T>> ArrayList<T>.quickSort(start: Int = 0, end: Int = size - 1) {
    val array = this

    if (array.isEmpty()) return
    if (start >= end) return

    val pivotIndex = Random.nextInt(start, end + 1)
    val pivot = array[pivotIndex]

    var i = start
    var j = end

    while (i <= j) {
        while (array[i] < pivot) {
            i++
        }
        while (array[j] > pivot) {
            j--
        }
        if (i <= j) {
            array[i] = array[j].apply {
                array[j] = array[i]
            }
            i++
            j--
        }
    }

    if (i < end) quickSort(i, end)
    if (0 < j) quickSort(start, j)
}
