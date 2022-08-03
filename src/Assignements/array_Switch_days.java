package Assignements;

import java.util.Scanner;

public class array_Switch_days {
    //Write a code where user is asked to enter a number to between 1 to 7 to get the name of the day of the week.User Array
    //ex. When user enters 1 you should print (Monday)
    public static void main(String[] args) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scanner = new Scanner(System.in);
        String day = "";
        boolean ask = true;
        while (ask) {
            System.out.print("Please Enter a number from 1 to 7:(or press '0' for EXIT: ");
            int number = scanner.nextInt();
            if (number==0) {
                ask = false;
                System.out.println("You exit!");
                break;
            }
            if (number > 0 && number < 8) {
                day = week[number - 1];
                System.out.println("The number you have entered: " + number + "\nThe day is: " + day);
            } else {
                day = "invalid";
                System.out.println("The number you have entered: " + number + "\nThe day is: " + day);
                System.out.println("You exit!");
                break;
            }
        }
    }
}