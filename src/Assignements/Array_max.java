package Assignements;

import java.util.Arrays;
import java.util.Scanner;

public class Array_max {
    public static void main(String[] args) {
        //Write a code where user is asked to enter 10 numbers and store those number in the integer array.
        // Print the max number and all the element in the array(Yo can use Arrays.toString() method)
        Scanner scanner = new Scanner(System.in);
        System.out.println("*The max Element*");
        int [] number = new int[10];
        int max = Integer.MIN_VALUE;
        int i = 0;
       while (i<10){
           System.out.print("Please enter " + (i + 1) + ". number:  ");
           int num = scanner.nextInt();
           number[i] +=num;
           i++;
       }
        //System.out.println(Arrays.toString(number));
        for (int j = 0; j < number.length; j++) {
            if (number[j] > max){
                max = number[j];
                }
            }
        System.out.println("The max number in the Array is: " + max);
        System.out.println("All elements of array is: " + Arrays.toString(number));
    }
}
