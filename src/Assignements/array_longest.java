package Assignements;

import java.util.Arrays;
import java.util.Scanner;

public class array_longest {
    //Write a code where it ask user to enter a Sentence, Find the longest word in the sentence and print it with the length of it.
    //ex. ,"I love being outside with my dog but I have a lot to do today"
    //asnwer: Outside and the length is 7
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Sentence: ");
        String sentence = scanner.nextLine();
        String[] sentenceSplit = sentence.split(" ");
        String longest = sentenceSplit[0];
        int length = 0;
        for (int i = 0; i < sentenceSplit.length; i++) {
            if (longest.length() < sentenceSplit[i].length()) {
                longest = sentenceSplit[i];
                length = longest.length();
            }
        }

        System.out.println("The longest word is : " +"\""+ longest + "\""+" \nand the length of longest word is: " + length);
    }
}
