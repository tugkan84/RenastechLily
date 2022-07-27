package Assignements;

import java.util.Arrays;
import java.util.Scanner;

public class Assignement_array_sum {
    //Homework 11)
    ////Write   a   program   that   creates   an   array   of   10   elements   size.
    ////   Your   program   should   prompt   the   user   to   input   numbers   in   array
    // and   then   display   the   sum   of   all
    //array   elements.
    public static void main(String[] args) {

        System.out.println("Need to enter 10 numbers");
        Scanner scanner = new Scanner(System.in);
        int[] element = new int[10];
        int sum = 0;
        int i = 0;
        while (i < 10) {
            System.out.print("Please enter "+ (i+1) +". number:  ");
            int scanNum = scanner.nextInt();
            element[i] = scanNum;
            sum += element[i];
            i++;
        }
        System.out.println(Arrays.toString(element));
        System.out.println("The sum of all numbers is=" + sum);
    }
}
