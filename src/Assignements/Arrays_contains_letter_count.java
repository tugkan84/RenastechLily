package Assignements;

import java.util.Scanner;

public class Arrays_contains_letter_count {
    //Write a code where user enters a sentence.
    // Find how many of those words contains the "da"(ignore the case)
    // and print the word if it contains "da"(ignore the case)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        String sentenceIgnore = sentence.toLowerCase();
        String[] sentenceSplit = sentenceIgnore.split(" ");
        String wordDa = "";
        int count = 0;
        for (int i = 0; i < sentenceSplit.length; i++) {
            if (sentenceSplit[i].contains("da")) { //contains("da")){
                wordDa += sentenceSplit[i] + " ";
                count++;
            }
        }
        System.out.println("The words include 'da' : " + wordDa);
        System.out.println("the count: " + count);
    }
}
