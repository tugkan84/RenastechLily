package Assignements;

import java.util.Scanner;

public class Assignement_promeNum {
    public static void main(String[] args) {
        //// Write a program that will check if the given number is a  prime number or not
        //
        //        // 13 => prime , 17 prime
        //        // 22  -- not prime

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int number = scanner.nextInt();
        int countNum = 0;

        if(number==2 || number ==3){
            System.out.println(number + "Prime number");
        }else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    countNum++;
                }
            }
        }
        if (countNum == 0) {
            System.out.println(number + "Prime number");
        } else {
            System.out.println(number + " not Prime number");
        }
//***** second answer
            System.out.println("primenums(23) = " + primenums(23));//primenums(23) = true
            System.out.println("primenums(6) = " + primenums(6));//false
            double num2 = 25.0;
            System.out.println(Math.sqrt(num2)); //5.0


        }
        public static boolean primenums(int num1){
            if (num1<=1){
                return false;
            }
            for (int i = 2; i < Math.sqrt(num1) ; i++) {
                if (num1 %i == 0){
                    return false;
                }
            }
            return true;
    }
}
