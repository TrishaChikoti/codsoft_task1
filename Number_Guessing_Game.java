import java.util.Random;
import java.util.Scanner;
public class Number_Guessing_Game {
    static Scanner sc = new Scanner(System.in);

    static void game() {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int maxAttempts = 10;
        int score = 0;
        int attempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have generated a random number between 1 and 100....");
        System.out.println("Can you guess the number!! You have a total of " + maxAttempts + " attempts.");

        for (int i = 0; i < maxAttempts; i++) {
            System.out.print("Enter your guess: ");
            int userGuess = sc.nextInt();

            if (userGuess == randomNumber) {
                System.out.println("Congratulations! You guessed the correct number in " + (attempts + 1) + " attempts.");
                score = maxAttempts - attempts;
                break;
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Guess again...");
            } else {
                System.out.println("Too high! Guess again...");
            }

            attempts++;
        }

        System.out.println("Thanks for playing! Your total score is: " + score);
    }

    public static void main(String[] args) {
        game();
        while(true) {
        System.out.print("Do you want to play again? (yes or no): ");
        String wannaPlayAgain = sc.next();
        
        if (wannaPlayAgain.equalsIgnoreCase("yes")) {
            game();
        } 
        else {
            System.out.println("Thanks for playing!");
            break;
        }
    }
   }
}
