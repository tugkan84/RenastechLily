package Assignements;

import java.util.Scanner;

public class Assignment_reverseNumber {
    public static void main(String[] args) {
        //Write a code where it ask user to enter an integer number
        //- Reverse the given number and print the result
        //- Example input ( 5678 )
        //- Example output ( 8765 )
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int reversedNum= 0;

        while (number != 0) {
            int remainder = number % 10;
            reversedNum = reversedNum * 10 + remainder;
            number = number/10;
        }
        System.out.println(reversedNum);
// our
//
//        String rev = 4656 +"";
//        System.out.println(rev);
//        String result="";
//        for (int i = rev.length()-1; i >=0 ; i--) {
//            result +=rev.charAt(i);
//        }
//        System.out.println(result);

    }
    }

