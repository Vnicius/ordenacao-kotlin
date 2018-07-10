import java.io.File

fun main(args: Array<String>) {
    val sortType = args[0]
    val values = File(args[1])
                    .bufferedReader()
                    .readLines()
                    .map { it.toDouble() }
                    .toTypedArray()

    val v = values.clone()

    when(sortType){
        "selection" -> SelectionSort().sort(values)
        "insertion" -> InsertionSort().sort(values)
        "merge" -> MergeSort().sort(values)
        "quick" -> QuickSort().sort(values)
        "heap" -> HeapSort().sort(values)
        else -> println("Invalid sort type")
    }

    values.forEach { println(it) }
}