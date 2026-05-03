def bubblesort(arr: Array[Int]): Array[Int] = {
    val n = arr.length

    for (i <- 0 until n) {
        for (j <- 0 until n - 1) {
            if (arr(j) > arr(j + 1)) {
                val temp = arr(j)
                arr(j) = arr(j + 1)
                arr(j + 1) = temp
            }
        }
    }

    arr
}

val arr = Array(5, 3, 1, 2, 4)

println("Sorted Array: " + bubblesort(arr).mkString(", "))
