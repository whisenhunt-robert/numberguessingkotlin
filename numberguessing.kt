import kotlin.math.roundToInt

fun main() {
    // This generates the random number between 1 and 100.
    val randomNumber = (Math.random() * 100).roundToInt
    // This prints out the welcome message.
    println("Welcome to my Number Guessing Game using Kotlin!")
    while (true) {
        // This prompts the player to enter a number between 0 and 100.
        print("Please enter a number between 0 and 100: ")
        // This store the player's guess as an integer.
        val playerGuess = Integer.parseInt(readLine())
        // If the player's guess is equal to the random number, this statement happens.
        if (playerGuess == randomNumber) {
            // If the player guessed the randomly generated number, it prints this.
            println("That's correct! Great job!")
            return
        } else {
            // If the player guessed incorrectly, it prints this.
            println("That's incorrect, please try again.")
        }
    }
}