import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;


public class GuessingGame {
    public GuessingGame(){
        System.out.println("Howdy, what's your name?\n");
        System.out.println("\"(type in your name) \"");
        Scanner scan = new Scanner(System.in);
        String playerName = scan.nextLine();

        System.out.println(playerName + ", I'm thinking of a number between 1 and 100.\n");
        System.out.println("Try to guess my number.\n");

        Random random = new Random();
        int secretNumber = random.nextInt(100);
        int tries = 0;

        while (true) {
            tries++;
            int guess;
            try {
                guess = scan.nextInt();
            } catch (InputMismatchException e) {
                String bad_input = scan.next();
                System.out.println("That's not an integer, try again");
                continue;
            }
            if (guess < 1 || guess > 100) {
                System.out.println(guess + " is not a valid number, try again");
                continue;
            }
            if (guess > secretNumber) {
                System.out.println("Your guess is too high, try again.\n");
            } else if (guess < secretNumber) {
                System.out.println("Your guess is too low, try again.\n");
            } else {
                System.out.println("Well done, " + playerName + "! You found my number in" + tries + " tries!");
                break;
            }
        }
    }
}
