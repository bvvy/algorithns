package search

/**
 * Created by bvvy on 2017/6/14.
 */
class BinarySearch {
    fun search(arr: Array<Int>, key: Int): Int {
        var lo = 0
        var hi = arr.size - 1
        while (hi>= lo) {
            var mid = (lo + hi) / 2
            if (key > arr[mid]) lo = mid+1
            else if (key < arr[mid]) hi = mid
            else return mid
        }
        return -1
    }
}

fun main(args: Array<String>) {
    var binarySearch =  BinarySearch ()
    val arr = Array(5, { i -> (i+1)})
    for(i in arr) println(i)

    println( binarySearch.search(arr, 2))
}