const val pi = 3.14  // Compile-time constant, value must be known at compile time

fun main() {

    // Declaring and initializing a variable at the same time
    val name1: String = "Alice"  // Type can be inferred, but it's not necessary

    // Declaring a variable without assigning a value immediately
    // You must specify the type
    var age: Int  // Variable declared, but not initialized yet

    // Now you can assign a value later
    age = 25

    println("Name: $name1")
    println("Age: $age")

    var num1 = 4
    var num2 = 2

    val division = num1 / num2     // Immutable variable, value assigned at runtime

    var name2 = "Ruan"     // Mutable variable

    println("Hello world!")
    println(name2)

    name2 = "Souza"
    println(name2)
    println("The value of pi is $pi")
    println("The result of 4/2 is $division")
}