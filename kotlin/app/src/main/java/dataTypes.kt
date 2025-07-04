fun main() {
    // Integer types
    val age: Int = 25                // 32-bit integer (-2147483648 to 2147483647)
    val distance: Long = 1000L       // 64-bit integer, 'L' at the end (-9223372036854775807 to 9223372036854775807)
    val smallNumber: Byte = 10       // 8-bit integer (-128 to 127)
    val shortNumber: Short = 100     // 16-bit integer (-32768 to 32767)

    // Converting types

    val num: Long = 7000
    val conv: Number? = if (num in Byte.MIN_VALUE..Byte.MAX_VALUE) {
        num.toByte()   // Convert to Byte if in Byte range
    } else if (num in Short.MIN_VALUE..Short.MAX_VALUE){
        num.toShort()  // Convert to Short if in Short range
    } else if (num in Int.MIN_VALUE..Int.MAX_VALUE) {
        num.toInt()    // Convert to Int if in Int range
    } else if (num in Long.MIN_VALUE..Long.MAX_VALUE) {
        num            // Keep as Long if in Long range
    } else {
        null           // Value is out of range (should not happen for Long)
    }

    // Floating point types
    val temperature: Float = 36.6F   // 32-bit floating point, 'F' at the end
    val pi: Double = 3.14159         // 64-bit floating point
    val avogadroNumber: Float = 35E3F  // 35,000 in scientific notation
    val smallAvogadroNumber: Double = 12E4   // 120,000 in scientific notation

    // Character type
    val letter: Char = 'A'           // If you want to define a single character, use single quotes (' ').

    // Boolean type
    val isActive: Boolean = true     // Boolean value (true or false)

    // String type
    val name: String = "Alice"     // String of characters
    val firstChar: Char = name[0]  // Gets the first character ('A')
    val thirdChar: Char = name[2]  // Gets the third character ('i')
    var message: String = "ABSHWKHDJUJ,MU89 MK,.NGY"
    val messageLength: Int = message.length  // Returns the number of characters in the string
    val original: String = "Kotlin Language"
    val upper: String = original.uppercase()  // "KOTLIN LANGUAGE"
    val lower: String = original.lowercase()  // "kotlin language"
    var txt1: String = "Good day"
    var txt2: String = "Good night"
    val comp: Int = txt1.compareTo(txt2) // .compareTo() compares two strings lexicographically.
                                         // Returns 0 if both strings are equal.
                                         // Returns a negative number if the first string comes before the second.
                                         // Returns a positive number if the first string comes after the second.
    val txt3: String = "That's right" // To define a string in Kotlin, use double quotes (" ").
                                      // You can include single quotes (') inside the string without any problem.

    val firstName: String = "Alice"
    val lastName: String = "Smith"
    val fullName: String = firstName + " " + lastName  // Concatenates firstName, a space, and lastName

    // Array type
    val numbers: Array<Int> = arrayOf(1, 2, 3) // Array of integers

    // List types
    val names: List<String> = listOf("Ana", "Bob") // Immutable list of strings
    val scores: MutableList<Int> = mutableListOf(10, 20) // Mutable list of integers

    // Set types
    val uniqueNumbers: Set<Int> = setOf(1, 2, 3) // Immutable set
    val mutableUniqueNumbers: MutableSet<Int> = mutableSetOf(1, 2, 3) // Mutable set

    // Map types
    val userAges: Map<String, Int> = mapOf("Alice" to 25, "Bob" to 30) // Immutable map
    val mutableUserAges: MutableMap<String, Int> = mutableMapOf("Alice" to 25, "Bob" to 30) // Mutable map

    // Any type (root of all types)
    val anything: Any = "Can be any type" // Can hold any type of value

    // Unit type (function with no return value)
    fun printHello(): Unit {
        println("Hello!")
    }

    // Nothing type (function that never returns)
    fun fail(): Nothing {
        throw Exception("This function always throws an exception")
    }

    // Printing some values
    println("Age: $age")
    println("Distance: $distance")
    println("Temperature: $temperature")
    println("Value: $num")
    println("Original type of value: ${num.javaClass.simpleName}") // ${variable.javaClass.simpleName} returns the type of the variable
    println("Converted type: ${conv?.javaClass?.simpleName}")
    println("Letter: $letter")
    println("Is active: $isActive")
    println("Name: $name")
    println("The first character is: $firstChar")
    println("The third character is: $thirdChar")
    println("The message is: $message")
    println("The length of the message is: $messageLength")
    println("Original: $original")
    println("Uppercase: $upper")
    println("Lowercase: $lower")
    if (comp == 0) {
        println("Same text: $txt1")
    } else {
        println("Different texts: $txt1 and $txt2")
    }
    println("First name: $firstName")
    println("Last name: $lastName")
    println("Full name: $fullName")
    println("Full name: $firstName $lastName") // This line uses a string template (also called string interpolation) in Kotlin.
                                               // The $ symbol is used to insert the value of a variable directly into the string.
                                               // $firstName and $lastName will be replaced by the values of those variables when the code runs.
    println("Numbers: ${numbers.joinToString()}")
    println("Names: ${names.joinToString()}")
    println("Scores: ${scores.joinToString()}")
    println("Unique numbers: ${uniqueNumbers.joinToString()}")
    println("User ages: $userAges")
    println("Avogadro's number: $avogadroNumber")
    println("Small avogadro number: $smallAvogadroNumber")
    printHello()
}