package Assignements;

public class Assignement_Palindrome {
    public static void main(String[] args) {
        /* Task : Write a program that checks if a String is a Palindrome.
         * Example: input : Java , output: java is not  palindrome
         * Example: input : kayak , output : kayak is a palindrome
         * Example: input level , ouput : level is a palindrome
         * tip: A palindrome is a word, number, phrase, or other sequence of characters
         * which reads the same backward as forward, such as madam or racecar.
         */
        String given = "kayak";
        String reverse = "";
        for (int i = given.length()-1; i >= 0; i--) {
            reverse += given.charAt(i);
        }
        if (given.equals(reverse)) {
            System.out.println(given + " is Palindrome");
        }
        else{
            System.out.println(given + " is not Palindrome");
        }
    }
}
