package Assignements;

import java.util.Scanner;

public class Assignement_If_else {
    //// Tip Calculator  [if-else]
    //
    //Mark wants to build a very simple tip calculator for whenever he goes to eat in a restaurant.
    //In his country, it's usual to tip 15% if the bill value is between 99 and 280.
    //If the value is different, the tip is 20%.
    //
    //Print as the string to the console containing the bill value, the tip, and the final value (bill + tip).
    //
    //Example: "The bill was 275, the tip was 41.25, and the total value 316.25
    //
    //Data to test 97 ,100, 275 , 25
    public static void main(String[] args) {

        System.out.println("billCalculate(100) = " + billCalculate(100));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your bill: ");
        int bill1 = scanner.nextInt();
        double tip;

        if (bill1 >= 99 && bill1 <= 280) {
            tip = (bill1 * 15) / 100;
            System.out.println("The bill was " + bill1 + "," + "The tip was " + tip + "," + " The final value is " + (bill1 + tip));
        } else {
            tip = (bill1 * 20) / 100;
            System.out.println("The bill was " + bill1 + "," + "The tip was " + tip + "," + " The final value is " + (bill1 + tip));
        }
    }

    public static String billCalculate(int bill) {
        double tip = 0;
        double total = 0;
        if (bill >= 99 && bill <= 280) {
            tip = (bill * 15) / 100;
        } else {
            tip = (bill * 20) / 100;
        }
        total = (bill + tip);
        return "The bill was: " + bill + "\tThe tip was :" + tip + "\tThe final value is: " + total;
    }
}
