fun main() {
    // 1. Creating an array of integers
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println("Array of numbers: ${numbers.joinToString()}")

    // 2. Accessing elements by index (indices start at 0)
    println("First element: ${numbers[0]}")
    println("Third element: ${numbers[2]}")

    // 3. Modifying elements (arrays are mutable)
    numbers[1] = 20
    println("Modified array: ${numbers.joinToString()}")

    // 4. Array size
    println("Array size: ${numbers.size}")

    // 5. Creating an array of a specific size with default values
    val zeros = Array(5) { 0 }  // Array of 5 zeros
    println("Array of zeros: ${zeros.joinToString()}")

    // 6. Iterating over an array
    println("Iterating over array:")
    for (num in numbers) {
        println(num)
    }

    // 7. Iterating with indices
    println("Iterating with indices:")
    for (i in numbers.indices) {
        println("Element at index $i is ${numbers[i]}")
    }

    // 8. Using built-in functions
    println("Sum of numbers: ${numbers.sum()}")
    println("Max number: ${numbers.maxOrNull()}")
    println("Min number: ${numbers.minOrNull()}")

    // 9. Creating primitive type arrays for better performance
    val intArray = intArrayOf(1, 2, 3, 4, 5)
    println("IntArray: ${intArray.joinToString()}")

    val doubleArray = doubleArrayOf(1.0, 2.0, 3.0)
    println("DoubleArray: ${doubleArray.joinToString()}")

    // 10. Converting between arrays and lists
    val list = numbers.toList()
    println("Converted to list: $list")

    val arrayFromList = list.toTypedArray()
    println("Converted back to array: ${arrayFromList.joinToString()}")
}