package Day_13_WhileLoop;

import java.util.Scanner;

public class Topic_3_WhileLoopContExample {
    public static void main(String[] args) {
        //Same example with the previous one but using while(true)
        Scanner scanner = new Scanner(System.in);
        System.out.println("********** Welcome to calculator ********");
        System.out.println("Please select the operations 1: for Addition \n2: for Subtraction \n3: for multiplication \n4: for division");
        int consoleNum = scanner.nextInt();
        while (true) {
            if (consoleNum == 1) {
                System.out.println("Please enter your first num: ");
                double num1 = scanner.nextDouble();
                System.out.println("Please enter your second num: ");
                double num2 = scanner.nextDouble();
                System.out.println("The result is: " + (num1 + num2));
            }
            else if (consoleNum == 2) {
                System.out.println("Please enter your first num: ");
                double num1 = scanner.nextDouble();
                System.out.println("Please enter your second num: ");
                double num2 = scanner.nextDouble();
                System.out.println("The result is: " + (num1 - num2));
            }
            else if (consoleNum == 3) {
                System.out.println("Please enter your first num: ");
                double num1 = scanner.nextDouble();
                System.out.println("Please enter your second num: ");
                double num2 = scanner.nextDouble();
                System.out.println("The result is: " + (num1 * num2));
            }
            else if (consoleNum == 4) {
                System.out.println("Please enter your first num: ");
                double num1 = scanner.nextDouble();
                System.out.println("Please enter your second num: ");
                double num2 = scanner.nextDouble();
                System.out.println("The result is: " + (num1 / num2));
            }
            else{
                break;
            }
            //if you dont ask again, it stuck whatever before it is.
          System.out.println("Please select the operations 1: for Addition \n2: for Subtraction \n3: for multiplication \n4: for division");
          consoleNum = scanner.nextInt();
        }
        System.out.println("You exit from the calculation");
    }
}
