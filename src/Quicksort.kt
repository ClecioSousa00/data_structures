fun quicksort(list: MutableList<Int>, firstIndex: Int = 0, lastIndex: Int): MutableList<Int> {
    if (firstIndex < lastIndex) {
        val pivoIndex = partition(list, firstIndex, lastIndex)
        quicksort(list, firstIndex, pivoIndex - 1)
        quicksort(list, pivoIndex + 1, lastIndex)
    }
    return list
}

fun partition(list: MutableList<Int>, firstIndex: Int, lastIndex: Int): Int {
    val pivo = list[lastIndex]
    var index = firstIndex
    for (j in firstIndex..<lastIndex) {
        if (list[j] <= pivo) {
            list[index] = list[j].also { list[j] = list[index] }
            index++
        }
    }
    list[index] = list[lastIndex].also { list[lastIndex] = list[index] }
    return index
}

fun main() {
    val list = mutableListOf(5, 1, 7, 9, 6, 4, 3, 8, 5)
    println(quicksort(list, lastIndex = list.size - 1))
}
