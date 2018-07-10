class QuickSort: Sort {
    override fun sort(values: Array<Double>) {

        fun partition(arr: Array<Double>, begin: Int, end: Int): Int {
            val pivot = arr[begin]
            var top = begin

            for (i in begin..end) {
                if (arr[i] < pivot) {
                    arr[top] = arr[i]
                    arr[i] = arr[top + 1]
                    top++
                }
            }

            arr[top] = pivot

            return top
        }

        tailrec fun quickSort(arr: Array<Double>, begin: Int, end: Int) {
            if (begin < end) {
                val middle = partition(arr, begin, end)

                quickSort(arr, begin, middle)
                quickSort(arr, middle + 1, end)
            }
        }

        quickSort(values, 0, values.size - 1)
    }
}