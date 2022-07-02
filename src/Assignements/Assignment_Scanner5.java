package Assignements;

import java.util.Scanner;

public class Assignment_Scanner5 {
    //Write a program where User is being asked to enter the first name, and last name
    // and print the full name on the console based on given information.
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String nameFirst;
        String nameLast;
        String fullName;
        System.out.print("Enter your first name: ");
        nameFirst = scanner.next();

        System.out.print("Enter your last name: ");
        nameLast = scanner.next();

        fullName = nameFirst + "\t" + nameLast;
        System.out.println("Fullname is: " + fullName);

    }
}
