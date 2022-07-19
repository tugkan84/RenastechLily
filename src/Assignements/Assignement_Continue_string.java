package Assignements;

import java.util.Scanner;

public class Assignement_Continue_string {
    public static void main(String[] args) {
        //Write a code where user is asked to enter a string
        //- create a new string with entered string but do not include 'L' 'M', 'T' 'E' in the new string
        //- print the new string

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String name = scanner.next();
        name = name.toUpperCase();
        String renamed = "";

        for (int i = 0; i < name.length(); i++) {
            if ((name.charAt(i) == 'L') || (name.charAt(i) == 'M') || (name.charAt(i) == 'T') || (name.charAt(i) == 'E')){
                continue;
            }
            renamed += name.charAt(i);
        }
        System.out.println(renamed);

//        for (int i = 0; i < name.length(); i++) {
//            if (name.charAt(i) == 'L') {
//                continue;
//            }
//            if (name.charAt(i) == 'M') {
//                continue;
//            }
//            if (name.charAt(i) == 'T') {
//                continue;
//            }
//            if (name.charAt(i) == 'E') {
//                continue;
//            }
//            renamed += name.charAt(i);
//        }
//
//        System.out.println(renamed);

    }
}


