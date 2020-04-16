import java.util.Random;
import java.util.Scanner;

public class Guessgame {

    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);


        int number = random.nextInt(100);
        int guess = -1;

        while (guess != number) {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();

            if (guess < number) {

                System.out.println("Too low, please try again");

            } else if (guess > number) {


                System.out.println("Too high, please try again");

            } else {

                System.out.println("Correct, the number was " + number);
            }
        }
    }
}

// Pseudocode
// Have computer generate a random number
// Get input from the user
// Prompt the user for input
//Begin while loop
//Have user pick a number between 0 and 99
//Check if the guess is high, low or correct
//communicate to user if number is to high
//communicate to user if number is to low
//communicate to user if number is guessed correctly
//If  guess wrong prompt the user to guess again
//check if guess is correct
//If guess correct End while loop

