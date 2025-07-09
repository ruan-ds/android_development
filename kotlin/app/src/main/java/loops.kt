fun main() {
    // 1. For loop - iterating over a range
    println("For loop with range:")
    for (i in 1..5) {  // from 1 to 5 inclusive
        println(i)
    }

    // 2. For loop - iterating over a collection (list)
    val fruits = listOf("Apple", "Banana", "Cherry")
    println("\nFor loop over a list:")
    for (fruit in fruits) {
        println(fruit)
    }

    // 3. For loop with index
    println("\nFor loop with index:")
    for (index in fruits.indices) { // .indices gives the valid index range of a list or array
        println("Fruit at index $index is ${fruits[index]}")
    }

    // 4. While loop
    println("\nWhile loop:")
    var count = 1
    while (count <= 5) {
        println(count)
        count++
    }

    // 5. Do-while loop
    println("\nDo-while loop:")
    var num = 1
    do {
        println(num)
        num++
    } while (num <= 5)

    // 6. Using break to exit a loop early
    println("\nBreak example:")
    for (i in 1..10) {
        if (i == 4) {
            println("Breaking at $i")
            break  // exit the loop
        }
        println(i)
    }

    // 7. Using continue to skip an iteration
    println("\nContinue example:")
    for (i in 1..5) {
        if (i == 3) {
            println("Skipping $i")
            continue  // skip the rest of this iteration
        }
        println(i)
    }

    // 8. For loop with decrement using downTo
    println("\nFor loop with decrement (downTo):")
    for (i in 5 downTo 1) {
        println(i)
    }

    // 9. For loop with decrement and step
    println("\nFor loop with decrement and step:")
    for (i in 10 downTo 2 step 2) {
        println(i)
    }

    // 10. While loop with decrement
    println("\nWhile loop with decrement:")
    var w = 5
    while (w >= 1) {
        println(w)
        w--
    }

    // 11. Do-while loop with decrement
    println("\nDo-while loop with decrement:")
    var d = 5
    do {
        println(d)
        d--
    } while (d >= 1)
}