package Assignements;

import java.util.Random;
import java.util.Scanner;

public class Assignement_guessing_game {
    // Guessing game
    //Please follow the step in the below
    // Step 1-  Create 2 int variables with name of randomNumber , userInput;
    // * //Step 2- Create a program will generate random a number between 1 to 10
    // * to generate a random number use >>
    // *  Random random=new Random();
    // *  int randomNumber = random.nextInt(10) + 1;
    // * // Step 2- Ask user to enter a number to enter a number between 1-10
    // * //Step 3-  Create a logic with do while loop that will ask user
    // * to enter a number as long as random number and userInput are not matching.
    // */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Guess a number between 1 to 10: ");

        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        int guess;
        do {
            guess = scanner.nextInt();
            if (guess == randomNumber) {
                System.out.println("You won! Congratulations!");
                break;
            } else if (guess < randomNumber) {
                System.out.println("Your guess is smaller! Please try again!");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is greater! Please try again!");
            } else {
                System.out.println("Try again");
            }
        }
        while (randomNumber != guess);

    }
}

