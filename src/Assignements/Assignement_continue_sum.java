package Assignements;

import java.util.Scanner;

public class Assignement_continue_sum {
    public static void main(String[] args) {
        //- Write a code where user is asked to enter a number
        //- Print the even sum of the even numbers from 0 to entered number(included)
        // but the Sum should not pass 390

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;

        for (int i = 0; i <= number; i += 2) {
            if (sum+i < 390) {
                sum +=i;
            }else{
                break;
            }
        }
        System.out.println(sum);

    }
}
