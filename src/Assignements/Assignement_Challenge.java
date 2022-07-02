package Assignements;

import java.util.Scanner;

public class Assignement_Challenge {
    //Challenge Question:
    //Write a program Where user is being ask to select items from the list you presented for instance:
    //Select 1 for Shirt -40
    //Select 2 for pants -60
    //select 3 for dress -100
    //select 4 for hat   - 10
    //select 5 for shoes -120
    //User will select one item each time and until users has 3 items.
    //shirt price is = 40
    //pants price is = 60
    //dress price is = 100
    //hat price is = 10
    //shoes price is = 120
    //if user total amount is more than 200, user will receive 20% off on the total price (edited)
    //if user total amount is more than 150, user will receive 15% off on the total  price (edited)
    //if user total amount is more than 100, user will receive 5% off on the total price (edited)
    //your job is to Use the topics we learnt and calculate the Users Total amount after User select 3 items and print it.

    public static void main(String[] args) {
        double shirt = 40;
        double pant = 60;
        double dress = 100;
        double hat = 10;
        double shoes = 120;
        double total = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("" +
                "    Select 1 for Shirt\n" +
                "    Select 2 for pants\n" +
                "    select 3 for dress\n" +
                "    select 4 for hat\n" +
                "    select 5 for shoes");

        System.out.print("Select one item from the list:");
        int select1 = scanner.nextInt();
        switch (select1) {
            case 1:
                total += shirt;
                break;
            case 2:
                total += pant;
                break;
            case 3:
                total += dress;
                break;
            case 4:
                total += hat;
                break;
            case 5:
                total += shoes;
                break;
            default:
                System.out.println("Invalid Selection");
        }

        System.out.print("Select one item from the list:");
        int select2 = scanner.nextInt();
        switch (select2) {
            case 1:
                total += shirt;
                break;
            case 2:
                total += pant;
                break;
            case 3:
                total += dress;
                break;
            case 4:
                total += hat;
                break;
            case 5:
                total += shoes;
                break;
            default:
                System.out.println("Invalid Selection");
        }

        System.out.print("Select one item from the list:");
        int select3 = scanner.nextInt();
        switch (select3) {
            case 1:
                total += shirt;
                break;
            case 2:
                total += pant;
                break;
            case 3:
                total += dress;
                break;
            case 4:
                total += hat;
                break;
            case 5:
                total += shoes;
                break;
            default:
                System.out.println("Invalid Selection");
        }

        if(total<=100){
            total=total;
        }
        else if (total > 100 && total <= 150) {
            total -= ((total *5)/100);
        }
        else if (total > 150 && total <= 200) {
            total -= ((total * 15)/100);
        }
        else {
            total -= ((total * 20) / 100);
        }
        System.out.println("The total price after discount is: " + total);
    }
}