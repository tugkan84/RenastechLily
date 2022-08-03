package Assignements;

import java.util.Scanner;

public class Arrays_contains_letter_Index {
    //Write a code where user is asked to enter a sentence,
    // find how many of the character 'a'(ignore the case) is in the sentence
    // and where is the index of that specific 'a' in the sentence.
    //ex. "A cat was found on the street of Nashville"
    //answer:
    //"A" is in index of 0,
    //"a" is in index of 3.
    //"a" is in index of 7.
    //"a" is in index of 23.
    //Count of "a"s is : 4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        //String sentenceIgnore = sentence.toLowerCase();
        char[] sentenceChar = sentence.toCharArray();
        int count = 0;
        for (int i = 0; i < sentenceChar.length; i++) {
            if(sentenceChar[i] =='a' || sentenceChar[i] =='A'){
                System.out.println("The letter: " +"\""+sentenceChar[i] +"\""+" is in the index: " + i );
                count++;
            }
        }
        System.out.println("The count of the letter 'a' and 'A' is: " + count);
    }
}
