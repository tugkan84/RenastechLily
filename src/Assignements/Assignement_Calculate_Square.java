package Assignements;

import java.util.Scanner;

public class Assignement_Calculate_Square {
    public static void main(String[] args) {
        //rite a code where user is asked to enter a number:
        //Calculate the square of all the numbers from 0 to given number
        // and print the result for each number, (square of a number is number*number == > 5*5 = 25 or 6*6 = 36

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int ScanNum = scanner.nextInt();
        int calcul;

        for (int i = 0; i < ScanNum; i++) {
          calcul= i*i;
            System.out.println(i + "*" + i + " = " + calcul);
        }
    }
}
