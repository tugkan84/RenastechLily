package Assignements;

public class Assignement_IfElsenested {

    ///Telephone Bill
    ////Write a program to calculate the monthly telephone bills as per the following rule:
    ////Minimum Rs. 200 for up to 100 calls.
    ////Plus Rs. 0.60 per call for the next 50 calls.
    ////Plus Rs. 0.50 per call for the next 50 calls.
    ////Plus Rs. 0.40 per call for any call beyond 200 calls.
    public static void main(String[] args) {
        int callsNum = 120 ;
        int total = callsNum;
        double bill;

        if (callsNum <= 100) {
            bill = 200;
        } else if (callsNum > 100 && callsNum <= 150) {
            callsNum = callsNum - 100;
            bill = 200 + (0.60 * callsNum);
        } else if (callsNum > 150 && callsNum <= 200) {
            callsNum = callsNum - 150;
            bill = 200 + (0.60 * 50) + (0.50 * callsNum);
        } else {
            callsNum = callsNum - 200;
            bill = 200 + (0.60 * 50) + (0.50 * 50) + (0.40 * callsNum);
        }
        System.out.println("Your call is: " + total + "\tYour Bill is " + bill);

    }
}


