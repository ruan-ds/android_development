fun main() {
    // Example 1: Simple if statement
    val temperature = 30

    // If the condition is true, the code inside the block will run
    if (temperature > 25) {
        println("It's a hot day!")
    }

    // Example 2: if...else statement
    val age = 16

    // If the condition is true, the first block runs; otherwise, the else block runs
    if (age >= 18) {
        println("You are an adult.")
    } else {
        println("You are a minor.")
    }

    // Example 3: if...else if...else statement
    var score = 85

    // The program checks each condition in order.
    // The first true condition's block will run, and the rest will be skipped.
    if (score >= 90) {
        println("Grade: A")
    } else if (score >= 80) {
        println("Grade: B")
    } else if (score >= 70) {
        println("Grade: C")
    } else {
        println("Grade: D or below")
    }

    // Example 4: Using if as an expression to assign a value
    val number = 5
    val result = if (number % 2 == 0) {
        "Even"
    } else {
        "Odd"
    }
    println("The number $number is $result.")

    // Example 5: Nested if statements
    val x = 10
    val y = 20

    if (x > 0) {
        if (y > 0) {
            println("Both x and y are positive.")
        } else {
            println("x is positive, y is not positive.")
        }
    } else {
        println("x is not positive.")
    }

    // Example 6: Using 'when' for multiple conditions
    val dayOfWeek = 3

    // 'when' is similar to switch in other languages.
    // It checks the value of 'dayOfWeek' and matches it to the correct case.
    // In a 'when' expression, use '->' to separate each case from its result or code block.
    // Do NOT use '='. The correct syntax is:
    // value -> result
    val dayName = when (dayOfWeek) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }

    println("Day $dayOfWeek is $dayName.")

    // Example 7: Using 'when' with ranges and multiple values
    score = 78

    // 'when' can check if a value is within a range or matches multiple values
    val grade = when (score) {
        in 90..100 -> "A"           // score between 90 and 100 (inclusive)
        in 80..89 -> "B"            // score between 80 and 89
        70, 71, 72, 73, 74, 75, 76, 77, 78, 79 -> "C" // score is any value from 70 to 79
        in 60..69 -> "D"
        else -> "F"                 // any other value
    }

    println("Score: $score, Grade: $grade")

    // Example 8: Using 'when' to handle traffic light colors
    val trafficLightColor = "Green"

    // 'when' checks the value of trafficLightColor and runs the matching block
    when (trafficLightColor) {
        "Red" -> {
            println("Stop")   // If the color is Red, print "Stop"
        }
        "Yellow" -> {
            println("Slow")   // If the color is Yellow, print "Slow"
        }
        "Green" -> {
            println("Go")     // If the color is Green, print "Go"
        }
        else -> {
            println("Invalid color") // For any other value
        }
    }
}