package Assignements;

import java.util.Scanner;

public class Assignment_Scanner4 {
    //Use the Topic4_ScannerExample class (the one I did in the class) as base,
    // write the same code by using if else statements instead of switch and case statement
    public static void main(String[] args) {
//Create a Calculator
        //ask user enter first number
        // ask user second number
        // Select an operation

        int firstNum;
        int secondNum;
        int operationType;
        String operationResult;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        firstNum = scanner.nextInt();
        System.out.print("Enter your second number: ");
        secondNum = scanner.nextInt();
        System.out.println("Please select an operation \n1 for Multiplication \n2 for Division \n3 for Addition" +
                " \n4 for subtraction \n5 for mod");
        operationType = scanner.nextInt();
        if (operationType == 1) {
            operationResult = (firstNum * secondNum) + "";
        } else if (operationType == 2) {
            operationResult = (firstNum / secondNum) + "";
        } else if (operationType == 3) {
            operationResult = (firstNum + secondNum) + "";
        } else if (operationType == 4) {
            operationResult = (firstNum - secondNum) + "";
        } else if (operationType == 5) {
            operationResult = (firstNum % secondNum) + "";
        } else {
            operationResult = "The operation is not valid!";
        }
        System.out.println(operationResult);


    }
}

