package Day_13_WhileLoop;

import java.util.Scanner;

public class Topic_2_whileLoopExample {
    public static void main(String[] args) {

        //write a code user can do multiple calculation without rerunning the code

        Scanner scanner = new Scanner(System.in);
        System.out.println("********** Welcome to calculator ********");
        System.out.println("Please select the operations 1: for Addition \n2: for Subtraction \n3: for multiplication \n4: for division");
        int i = scanner.nextInt();
        while (i == 1 || i == 2 || i == 3 || i == 4) {
            //while (true){
            System.out.println("Please enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.println("Please Enter the second number: ");
            double num2 = scanner.nextDouble();
            if (i == 1) {
                double result = num1 + num2;
                System.out.println("The result is " + result);
            } else if (i == 2) {
                double result = num1 - num2;
                System.out.println("The result is " + result);
            } else if (i == 3) {
                double result = num1 * num2;
                System.out.println("The result is " + result);
            } else {
                double result = num1 / num2;
                System.out.println("The result is " + result);
            }
            System.out.println("Please select the operations \n1: for Addition \n2: for Subtraction \n3: for multiplication \n4: for division");
            i = scanner.nextInt();
        }
        System.out.println("You exit");
    }
}
