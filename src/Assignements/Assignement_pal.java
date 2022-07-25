package Assignements;

import java.util.Scanner;

public class Assignement_pal {
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
        for (int i = 0; i <= word.length()-3; i++) {
            substring =word.substring(i,i+3);
            boolean palindrome = false;
            String reversed = "";

            for (int j = substring.length()-1; j >=0; j--) {
                reversed = reversed + substring.charAt(j);
            }
                if (substring.equals(reversed)){
                    palindrome = true;
                    count++;
                    System.out.println("The palindromes are : " +substring);
                }else{
                    palindrome =false;
                }
            }
        System.out.println("The count: "+count);

    }
}


