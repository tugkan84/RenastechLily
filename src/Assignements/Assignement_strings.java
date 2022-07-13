package Assignements;

import java.util.Locale;
import java.util.Scanner;

public class Assignement_strings {
    //Write a code where user is asked to enter a Name,
    //if the name start with “A” and ends with “L”,  Replace “A” with “B”and print the result
    //If Name Start with “B” and ends with “L” also Contains “A” replace the second character of the name with “G”
    //If name starts with “C” and ends with “K” , Check is the name is equal to “Clark” or “CLARK”.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Name: ");
        String name = scanner.nextLine();
        name = name.toUpperCase();
        String result = "";

        if (name.startsWith("A") && name.endsWith("L")) {
            result = name.replace("A", "B");
        }else if (name.startsWith("B") && name.endsWith("L")) {
            if (name.contains("A")) {
                result = name.replace(name.charAt(1), 'G');
            } else {
                result = "invalid";
            }
        }else if ((name.startsWith("C") && name.endsWith("K")) && name.contains("CLARK")) {
            result = "valid";
        } else {
            result = " invalid";
        }
        System.out.println("The " + name + "'s result is: " + result);

    }
}

