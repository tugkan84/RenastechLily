package Day_8_Scanners;

import java.util.Scanner;

public class Topic_4_ScannerExample {
    public static void main(String[] args) {
     //Create a Calculator
        //ask user enter first number
        // ask user second number
        // Select an operation

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Enter your second number: ");
        int secondNum = scanner.nextInt();

        System.out.println("Choose your operation type: \nSelect + for addition \nSelect - for  substraction \nSelect / for division" +
                "\nSelect * for multiplication");
        String operationType = scanner.next();

        String operationResult;

        switch (operationType){
            case "+":
                operationResult = firstNum+secondNum + "";
                break;
            case "-" :
                operationResult = firstNum-secondNum + "";
                break;
            case "/" :
                operationResult = firstNum/secondNum + "";
                break;
            case "*":
                operationResult = firstNum*secondNum + "";
            default:
                operationResult = "Invalid";

        }
        System.out.println("You choose " + operationType + "\tYour result is: " + operationResult);




    }
}
