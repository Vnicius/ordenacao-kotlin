class SelectionSort: Sort {
    override fun sort(values: Array<Double>) {
        var minValueIndex: Int

        for(index in values.indices) {
            minValueIndex = index

            for(j in index..(values.size - 1)) {
                if (values[j] < values[minValueIndex])
                    minValueIndex = j
            }

            values[minValueIndex] = values[index].also { values[index] = values[minValueIndex] }

//            var aux = values[index]
//            values[index] = values[minValueIndex]
//            values[minValueIndex] = aux
        }
    }
}