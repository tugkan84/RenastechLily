package Assignements;

import java.util.Scanner;

public class Assignments_evenOdd {
    public static void main(String[] args) {
        //Write a code where user is asked to enter a number.
        //Find the sum of all the even numbers between 0 to that number (included)
        //Find the sum of all the odd numbers between 0 to that number (included)

        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter a num: ");
        int ScanNum = scanner.nextInt();
        int sumEven=0;
        int oddEven=0;

        for (int i = 0; i <= ScanNum; i++) {
            if (i %2 == 0){
                sumEven+=i;
            }else{
                oddEven+=i;
            }
        }
        System.out.println("Even numbers sum: "+sumEven);
        System.out.println("Odd numbers sum: "+oddEven);

    }
}
