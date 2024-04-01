import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to Rock, Paper, Scissors game!");
        System.out.println("Enter your choice: ");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");

        int userChoice = scanner.nextInt();
        int computerChoice = random.nextInt(3) + 1;

        System.out.println("Computer's choice: " + getChoiceString(computerChoice));

        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Invalid choice. Please enter a number between 1 and 3.");
        } else {
            String result = determineWinner(userChoice, computerChoice);
            System.out.println(result);
        }

        scanner.close();
    }

    public static String getChoiceString(int choice) {
        switch (choice) {
            case 1:
                return "Rock";
            case 2:
                return "Paper";
            case 3:
                return "Scissors";
            default:
                return "";
        }
    }

    public static String determineWinner(int userChoice, int computerChoice) {
        if (userChoice == computerChoice) {
            return "It's a tie!";
        } else if ((userChoice == 1 && computerChoice == 3) ||
                (userChoice == 2 && computerChoice == 1) ||
                (userChoice == 3 && computerChoice == 2)) {
            return "Congratulations! You win!";
        } else {
            return "Computer wins!";
        }
    }
}
