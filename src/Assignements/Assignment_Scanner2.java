package Assignements;

import java.util.Scanner;

public class Assignment_Scanner2 {
    //Write a code where user is being asked to enter a number and based on the entered number
    // print the number is positive, negative or zero

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        String numValue = (num < 0 ) ? "Negative" : (num == 0) ?  "Zero" : "Positive";
        System.out.println("the number is: " + numValue);




    }
}
