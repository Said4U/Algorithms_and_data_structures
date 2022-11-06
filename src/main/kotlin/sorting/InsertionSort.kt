package sorting

/**
 * insertion sort algorithm
 *
 * worst time: n²
 * the best time: n
 * average time: n²
 *
 * amount of time: 1
 */


fun <T : Comparable<T>> ArrayList<T>.insertionSort() {
    val array = this
    for (i in 1 until size) {
        val current = array[i]
        var j = i - 1
        while (j >= 0 && array[j] > current) {
            array[j + 1] = array[j]
            j--
        }
        array[j + 1] = current
    }
}