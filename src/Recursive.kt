fun sumRecursive(list: List<Int>, sizeList: Int): Int{
    if(sizeList == 0) return 0
    return list[sizeList - 1] + sumRecursive(list, sizeList - 1)
}
fun main(){
    val list = listOf(1,2,3,4,5,6,7,8,9,10)
    println(sumRecursive(list, list.size))
}