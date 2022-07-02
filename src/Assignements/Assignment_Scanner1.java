package Assignements;

import java.util.Scanner;

public class Assignment_Scanner1 {
    //Write a code where User is being asked for the first number, second number and third number.
    // Then Compare those number print the maximum number.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String maxNum = "";

        System.out.print("Enter your first Number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter your second number: ");
        int secondNum = scanner.nextInt();

        System.out.print("Enter your third number: ");
        int thirdNum = scanner.nextInt();
        maxNum = (firstNum > secondNum && firstNum > thirdNum) ? "The max number : " + firstNum :
                (secondNum > firstNum && secondNum >thirdNum) ? "The max number : " + secondNum : "The max number : " + thirdNum ;
        System.out.println(maxNum);


    }
}
