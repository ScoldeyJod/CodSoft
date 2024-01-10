import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Number Guessing Game!");

        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(100) + 1;
            int attempts = 0;
            int maxAttempts = 5;

            System.out.println("I have selected a number between 1 and 100.");
            System.out.println("You Have 5 Attempts For Gusseing The Number");

            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                scanner.nextLine();

                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the right number " + targetNumber + " in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            if (attempts >= maxAttempts) {
                System.out.println("No Attempts Left. The correct Answer is " + targetNumber + ".");
            }

            System.out.print("Want To Guess Number Again (Press 1 To Play Again Else Any Key): ");
            String playAgainInput = scanner.nextLine();
            playAgain = playAgainInput.equalsIgnoreCase("1");
        }

        System.out.println("Game over!");
         System.out.println("Your Score Is:" + score);
        scanner.close();
    }
}