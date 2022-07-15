package Assignements;

import java.util.Scanner;

public class Assignment_ForLoop {
    //Write a code where user is asked to enter a number and check for every number between 0 to
    // that number to see how many number between 0 to that number
    // can be divided to 3 and 5 and sum all those number, Print the result
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int ScanNum = scanner.nextInt();

        int count=0;
        int sum=0;

        for (int i = 0; i <= ScanNum; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("Sum is: "+ sum);
    }
}
