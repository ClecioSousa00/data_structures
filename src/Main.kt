fun <T : Comparable<T>> binarySearch(list: MutableList<T>, item: T): Int? {
    var minIndex = 0
    var lastIndex = list.size - 1

    while (minIndex <= lastIndex) {
        val middleIndex = (minIndex + lastIndex) / 2
        val middleListItem = list[middleIndex]
        when {
            middleListItem == item -> return middleIndex
            middleListItem > item -> lastIndex = middleIndex - 1
            else -> minIndex = middleIndex + 1
        }
    }
    return null
}

fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(binarySearch(list, 5))
}
