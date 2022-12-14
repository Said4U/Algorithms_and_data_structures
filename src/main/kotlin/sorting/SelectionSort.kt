package sorting

/**
 * selection sort algorithm
 *
 * worst time: n²
 * the best time: n²
 * average time: n²
 *
 * amount of memory: 1
 */

fun <T : Comparable<T>> ArrayList<T>.selectionSort() {
    val array = this
    for (i in 0 until size - 1) {
        var min = i
        for (j in i + 1 until size) {
            if (array[min] > array[j]) {
                min = j
            }
        }
        if (min != i) {
            array[min] = array[i].apply {
                array[i] = array[min]
            }
        }

        println(array)
    }
}