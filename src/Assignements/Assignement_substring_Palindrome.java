package Assignements;

import java.util.Scanner;

public class Assignement_substring_Palindrome {
    //Write code where:
    //- User is asked to enter a string,
    //- Use that string to see how many of 3 character substring is Palindrome 
    //- Print All the substring Palindrome Substrings 
    //- Example of Substring: word ==> "banana" 3 characters Palindrome substrings are ==> "ana", "nan" "ana". Count is 3.
    //PS = This is a little hard question please give your best and make sure you only use the things we have learned so far. 
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        int count = 0;
        String substring = "";

        for (int i = 0; i <= word.length() - 3; i++) {   // because we have substring 3 characters so we choose length-3
            substring = word.substring(i, i + 3);        // if we choose 4 char sub, it can be length-4
            //  System.out.println(substring);           // for seeing the substrings
             String reversed = "";

            for (int j = substring.length() - 1; j >= 0; j--) { // make string reverse for checking palindrome
                reversed = reversed + substring.charAt(j);
            }
            if (substring.equals(reversed)) {
                count++;
                System.out.println("The palindromes are : " + substring);
            }
        }
        System.out.println("The count: " + count);

    }
}


