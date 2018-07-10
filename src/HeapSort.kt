class HeapSort: Sort {
    override fun sort(values: Array<Double>) {

        tailrec fun maxHeap(arr: Array<Double>, startIndex: Int, len: Int) {
            val left = 2 * startIndex
            val rigth = 2 * startIndex + 1
            var bigger = startIndex

            if ( left <= len && arr[left] > arr[bigger] ) bigger = left

            if ( rigth <= len && arr[rigth] > arr[bigger] ) bigger = rigth

            if (bigger != startIndex) {
                arr[bigger] = arr[startIndex].also { arr[startIndex] = arr[bigger] }
                maxHeap(arr, bigger, len)
            }
        }

        fun buildHeap(arr: Array<Double>) {
            val len = arr.size - 1

            for ( i in (len/2) downTo 0 ) {
                maxHeap(arr, i, len)
            }
        }

        buildHeap(values)
        var len = values.size - 1

        for ( i in len downTo 0) {
            values[0] = values[i].also { values[i] = values[0] }
            maxHeap(values, 0, --len)
        }
    }

}