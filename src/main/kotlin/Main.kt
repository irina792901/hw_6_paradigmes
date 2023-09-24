
fun main(args: Array<String>) {
    val array = arrayOf(1, 3, 4, 6, 7, 8, 10, 13, 14)
    val number = 4
    var left = 0
    var right = array.size - 1
    println(findIndexOfNumber(array, left, right, number))
    println(findIndexOfNumberInArray(array, number))
}

// Пример бинарного поиска с применением рекурсии.
fun findIndexOfNumber(arr: Array<Int>, left: Int, right: Int, num: Int): Int {
    var lf = left
    var rf = right
    val middle = (lf + rf) / 2
    if (left > right) return -1
    else if (arr[middle] == num) {
        return middle
    } else if (arr[middle] > num) rf = middle - 1
    else lf = middle + 1
    return findIndexOfNumber(arr, lf, rf, num)
}
// Это пример обычный.
fun findIndexOfNumberInArray(arr: Array<Int>, num: Int): Int {
    var left = 0
    var right = arr.lastIndex
    while (left < right) {
        var middle = left + right
        if (arr[middle] == num) return middle
        else if (arr[middle] < num) {
            left = middle + 1
        } else right = middle - 1
    }
    return -1
}