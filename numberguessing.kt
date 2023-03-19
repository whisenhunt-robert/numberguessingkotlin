import kotlin.math.roundToInt

fun main() {
    // This generates the random number between 1 and 100.
    val randomNumber = (Math.random() * 100).roundToInt
    // This prints out the welcome message.
    println("Welcome to my Number Guessing Game using Kotlin!")
    while (true) {
        print("Please enter a number between 0 and 100: ")
        // This store the player's guess as an integer.
        val playerGuess = Integer.parseInt(readLine())
        // If the player's guess is equal to the random number, this statement happens.
        if (playerGuess == randomNumber) {
            println("That's correct! Great job!")
            return
        } else {
            println("That's incorrect, please try again.")
        }
    }
}