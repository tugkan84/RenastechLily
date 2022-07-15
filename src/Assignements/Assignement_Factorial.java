package Assignements;

import java.util.Scanner;

public class Assignement_Factorial {
    public static void main(String[] args) {
        //Write a code where user is asked to enter an integer number:
        // 1) Using the given number find the factorial of that number and Print the result.
        //example: 5 ==> 5! = 5*4*3*2*1 = 120

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int ScanNum = scanner.nextInt();
        int result=1 ;

        for (int i = ScanNum; i >= 1 ; i--) {
            result *= i;
        }
        System.out.print(ScanNum+ "! = "+ result);
    }
}
