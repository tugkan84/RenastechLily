package Assignements;

import java.util.Scanner;

public class Assignement_Continue {
    // Write a code where user is asked to enter a integer number
    //- print all the numbers that can NOT be divided by 2, or 5 and
    // Also can be divided by 7 between 1 to entered number(included)
    // (use the Continue Statement)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= number; i++) {
//            if (i % 2 == 0 || i % 5 == 0) {
//                if (i % 7 == 0)
//                {
//                    System.out.println(i);
//                }
//            }else{
//                System.out.println(i);
//            }
            if (i % 7 !=0 ){
                continue;
            }
            if ((i % 2 != 0) && (i % 5 != 0)){
                System.out.println(i);
            }
        }
    }
}

