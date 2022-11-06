package structures

interface Queue<T> {

    /**
     * adding to the front of the queue
     *
     * @param item - added element
     */
    fun enqueue(item: T)

    /**
     * returns the element from the front of the queue
     *
     * if the queue is empty, it will return null
     */
    fun peek() : T?

    /**
     * removes and returns an element from the front of the queue
     *
     * if the queue is empty it will return null
     */
    fun dequeue() : T?

    /**
     *
     * @return returns true if the queue is empty
     */
    fun isEmpty() : Boolean

    /**
     * clears the queue
     *
     */
    fun clear()

    /**
     * a simple function that converts a list into a normal Kotlin list for visual representation
     *
     * @return returns Kotlin a list of elements
     */
    fun toList() : List<T>

    /**
     * removes an element from the middle of the queue
     *
     * @return returns true if the element was successfully removed
     */
    fun remove(item: T) : Boolean

    /**
     * implementation using dynamic ArrayList
     *
     */
    class ArrayListQueue<T> : Queue<T> {
        private val data = ArrayList<T>()

        override fun enqueue(item: T) = data.add(0, item)

        override fun isEmpty() = data.isEmpty()
        override fun clear() = data.clear()

        override fun peek(): T? = if (isEmpty()) null else data.first()

        override fun dequeue() = if (isEmpty()) null else data.removeFirst()

        override fun remove(item: T) : Boolean {
            return if (data.contains(item)) {
                data.remove(item)
                true
            } else {
                false
            }
        }

        override fun toList(): List<T> {
            return data
        }
    }

    /**
     * implementation using linked list LinkedList
     *
     */
    class LinkedListQueue<T> : Queue<T> {
        private val data = java.util.LinkedList<T>()

        override fun enqueue(item: T) = data.add(0, item)

        override fun isEmpty() = data.isEmpty()
        override fun clear() = data.clear()


        override fun peek(): T? = if (isEmpty()) null else data.peekFirst()

        override fun dequeue() = if (isEmpty()) null else data.removeFirst()

        override fun remove(item: T) : Boolean {
            return if (data.contains(item)) {
                data.remove(item)
                true
            } else {
                false
            }
        }

        override fun toList(): List<T> {
            return data.toList()
        }


    }


}