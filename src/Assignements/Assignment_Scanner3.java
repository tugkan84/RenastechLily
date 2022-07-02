package Assignements;

import java.util.Scanner;

public class Assignment_Scanner3 {
    //Write a Revenue program, Where user enters the quantity of the products sold and  the price for each product.
    // Then Calculate the revenue based on giving information (hint: Revenue = quantity x price)

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the quantity of the product sold: ");
        int soldNumbers = scanner.nextInt();

        System.out.print("Enter the price of the product: ");
        double price = scanner.nextDouble();

        double revenue = soldNumbers*price;
        System.out.println("The revenue is: "+ revenue);
    }
}
