package Assignements;

import java.util.Scanner;

public class Assignement_continue2 {
    public static void main(String[] args) {
        //Write a code where the user is asked to enter an integer number
        //- sum of all the odd numbers between 1 to given number (included)
        // but exclude the 9,11,23,35 from the total sum
        // if those numbers happens to be in the range of 1 to given number.
        //- The sum should not exceed 300

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 != 0) {
                //System.out.print(i + " ");
                if (i == 9 || i == 11 || i == 23 || i == 35) {
                    continue;
                }else{
                    System.out.print(i + " ");
                }
            }
            if (sum + i < 300) {
                sum += i;
            }
        }System.out.println("The sum is: "+ sum);
    }
}



