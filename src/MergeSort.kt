class MergeSort: Sort {
    override fun sort(values: Array<Double>) {
        tailrec fun mergesort(arr: Array<Double>): Array<Double> {
            if (arr.size > 1) {
                val middle: Int = arr.size/2
                val left = mergesort(arr.sliceArray(0..(middle - 1)))
                val right = mergesort(arr.sliceArray(middle..(arr.size - 1)))
                var i = 0
                var j = 0
                var k = 0

                while (i < left.size && j < right.size) {
                    if (left[i] < right[j]) {
                        arr[k] = left[i]
                        i++
                    } else {
                        arr[k] = right[j]
                        j++
                    }

                    k++
                }

                while (i < left.size) {
                    arr[k] = left[i]
                    i++
                    k++
                }

                while (j < right.size) {
                    arr[k] = right[j]
                    j++
                    k++
                }
            }

            return arr
        }

        mergesort(values)
    }
}