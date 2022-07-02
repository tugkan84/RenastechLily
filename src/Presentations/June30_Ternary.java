package Presentations;

import java.util.Scanner;

public class June30_Ternary {
    public static void main(String[] args) {

        // example
        // Java program to find max number among two integers
        // numbers using ternary operator

   int a =2;
   int b = 1;


   int min;

        if (a < b) {
            min = a;
        }else{
            min = b;
        }
        System.out.println(min);

        min = (a<b) ? a : b;
        System.out.println(min);




        //example2
        //write a java program that ask the "user's age";
        //user's age : <18 ----> user is not available for work
        //           : between 18 and 50------> is available for work
        // use ternary operation

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        String result;

        result = (age < 18 || age>50) ? "user is not available for work" : "user is available for work";
        System.out.println(result);

    }





}
