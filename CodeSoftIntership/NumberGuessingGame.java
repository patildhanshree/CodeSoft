
import java.util.Scanner;
public class NumberGuessingGame
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        playGame(sc);

    }
    private static void playGame(Scanner scanner)
    {
        int score = 0;

        while (true) {

            int secretNumber =11;
            int attempts=0;

            System.out.println("\n Guess the number between 1 and 100!");

            while (true)
            {

                System.out.print("Your guess: ");
                int userGuess = scanner.nextInt();
                attempts++;
                if (userGuess == secretNumber)
                {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    break;
                } else if (userGuess < secretNumber)
                {
                    System.out.println("Too low! Try again.");
                } else
                {
                    System.out.println("Too high! Try again.");
                }

            }
            score += attempts;
            System.out.println("Your current score: " + score);
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("yes"))
            {
                System.out.println("Thanks for playing! Your final score: " + score);
                break;
            }
        }
    }
}