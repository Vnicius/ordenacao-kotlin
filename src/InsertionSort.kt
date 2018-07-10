class InsertionSort: Sort {
    override fun sort(values: Array<Double>) {
        var key: Int

        for ((index, value) in values.withIndex()) {
            key = index

            while (key > 0 && value < values[key - 1] ) {
                values[key] = values[key - 1]
                key--
            }

            values[key] = value
        }
    }
}