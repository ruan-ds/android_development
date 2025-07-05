fun main() {
    // Arithmetic operators
    val a = 10
    val b = 3

    println("Addition (a + b): ${a + b}")           // 13
    println("Subtraction (a - b): ${a - b}")        // 7
    println("Multiplication (a * b): ${a * b}")     // 30
    println("Division (a / b): ${a / b}")           // 3 (integer division)
    println("Modulus (a % b): ${a % b}")            // 1 (remainder)

    // Increment and decrement operators
    var y = 10
    y++    // increment by 1
    println("y after increment: $y")           // 11
    y--    // decrement by 1
    println("y after decrement: $y")           // 10

    // Assignment operators
    var x = 5
    x += 2   // x = x + 2
    println("x after += 2: $x")                     // 7

    x -= 1   // x = x - 1
    println("x after -= 1: $x")                     // 6

    // Comparison operators
    // == : equal
    // != : different (not equal)
    // >  : greater than
    // <  : less than
    // >= : greater than or equal to
    // <= : less than or equal to

    println("a == b (equal): ${a == b}")            // false
    println("a != b (different): ${a != b}")        // true
    println("a > b (greater than): ${a > b}")       // true
    println("a < b (less than): ${a < b}")          // false
    println("a >= b (greater or equal): ${a >= b}") // true
    println("a <= b (less or equal): ${a <= b}")    // false

    // Logical operators
    val isTrue = true
    val isFalse = false

    // && is the logical AND operator.
    // It returns true only if both sides are true.
    // In this case: true && false is false, because one side is false.
    println("isTrue && isFalse (and): ${isTrue && isFalse}")   // false

    // || is the logical OR operator.
    // It returns true if at least one side is true.
    // In this case: true || false is true, because one side is true.
    println("isTrue || isFalse (or): ${isTrue || isFalse}")    // true

    // ! is the logical NOT operator.
    // It inverts the boolean value.
    // In this case: !true is false.
    println("!isTrue (not): ${!isTrue}")                       // false

}