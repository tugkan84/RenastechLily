package Assignements;

import java.util.Locale;

public class Assignement_strings2 {
    /*First create one string and copy paste below paragraf.
    .And make modifications on the given paragraph listed below.
    .Make sure to create multiple string with each sentence from given paragraph
    .Make sure each sentence start with upper case letter.
    .Make sure city name start with the capital letter.
    .Make sure the rest of the letters are lower case.
    .Make sure to change the name, age and city information based on your information
    .make sure to get rid of the empty spaces in front and end of the sentences.
    .after you make the modification check each sentense’s length
    .Print each sentence and make sure they are correctly modified.
    .Print 1st, 4th and 5th indexed characters for each sentence
    .At the end combine all the sentence to get proper paragraph with modified sentences


        hello my name is <yourname>.       i am <yourage> years old.  i live in <yourcity>.
         I have been in IT industry for about 6 years.
         I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing.
          I have experience in EducatION, energy,finance and some manY Other AREAs.
           i HAve scrum master and Oracle java Programmer certificates.
             i love JaVA.   I designed and DEVELoped many automation test cases using BDD FRamework.

     */

    public static void main(String[] args) {
        String sentence1 = "hello my name is <yourname>.";
        String sentence2 = "i am <yourage> years old.";
        String sentence3 = "i live in <yourcity>.";
        String sentence4 = "I have been in IT industry for about 6 years.";
        String sentence5 = "I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing.";
        String sentence6 = "I have experience in EducatION, energy,finance and some manY Other AREAs.";
        String sentence7 = "i HAve scrum master and Oracle java Programmer certificates.";
        String sentence8 = "i love JaVA.";
        String sentence9 = "I designed and DEVELoped many automation test cases using BDD FRamework.";

        String sent1Mod = sentence1.replaceFirst("h","H").replace("<yourname>","Seray Tugcu").trim();
        String sent2Mod = sentence2.replaceFirst("i" ,"I").replace("<yourage>" , "31").trim();
        String sent3Mod = sentence3.replaceFirst("i","I").replace("<yourcity>","Kitchener").trim();
        String sent4Mod = sentence4.toLowerCase().replaceFirst("i","I").trim();
        String sent5Mod = sentence5.toLowerCase().replaceFirst("i","I").trim();
        String sent6Mod = sentence6.toLowerCase().replaceFirst("i","I").trim();
        String sent7Mod = sentence7.toLowerCase().replaceFirst("i","I").trim();
        String sent8Mod = sentence8.toLowerCase().replaceFirst("i","I").trim();
        String sent9Mod = sentence9.toLowerCase().replaceFirst("i","I").trim();
        System.out.println("The sentence: " +sent1Mod + " The length: "+ sent1Mod.length());
        System.out.println("The sentence: " +sent2Mod + " The length: "+ sent2Mod.length());
        System.out.println("The sentence: " +sent3Mod + " The length: "+ sent3Mod.length());
        System.out.println("The sentence: " +sent4Mod + " The length: "+ sent4Mod.length());
        System.out.println("The sentence: " +sent5Mod + " The length: "+ sent5Mod.length());
        System.out.println("The sentence: " +sent6Mod + " The length: "+ sent6Mod.length());
        System.out.println("The sentence: " +sent7Mod + " The length: "+ sent7Mod.length());
        System.out.println("The sentence: " +sent8Mod + " The length: "+ sent8Mod.length());
        System.out.println("The sentence: " +sent9Mod + " The length: "+ sent9Mod.length());

        System.out.println("1.char:"+ sent1Mod.charAt(0) + " - 4.char:" + sent1Mod.charAt(4) + " - 5.char:" + sent1Mod.charAt(5));
        System.out.println("1.char:"+ sent2Mod.charAt(0) + " - 4.char:" + sent2Mod.charAt(4) + " - 5.char:" + sent2Mod.charAt(5));
        System.out.println("1.char:"+ sent3Mod.charAt(0) + " - 4.char:" + sent3Mod.charAt(4) + " - 5.char:" + sent3Mod.charAt(5));
        System.out.println("1.char:"+ sent4Mod.charAt(0) + " - 4.char:" + sent4Mod.charAt(4) + " - 5.char:" + sent4Mod.charAt(5));
        System.out.println("1.char:"+ sent5Mod.charAt(0) + " - 4.char:" + sent5Mod.charAt(4) + " - 5.char:" + sent5Mod.charAt(5));
        System.out.println("1.char:"+ sent6Mod.charAt(0) + " - 4.char:" + sent6Mod.charAt(4) + " - 5.char:" + sent6Mod.charAt(5));
        System.out.println("1.char:"+ sent7Mod.charAt(0) + " - 4.char:" + sent7Mod.charAt(4) + " - 5.char:" + sent7Mod.charAt(5));
        System.out.println("1.char:"+ sent8Mod.charAt(0) + " - 4.char:" + sent8Mod.charAt(4) + " - 5.char:" + sent8Mod.charAt(5));
        System.out.println("1.char:"+ sent9Mod.charAt(0) + " - 4.char:" + sent9Mod.charAt(4) + " - 5.char:" + sent9Mod.charAt(5));

        System.out.println(sent1Mod + sent2Mod + sent3Mod  + "\n" + sent4Mod + sent5Mod + "\n"+ sent6Mod + sent7Mod + "\n" + sent8Mod + sent9Mod);

        boolean sent3City = sent3Mod.startsWith("K",11);//true
        boolean sent1Name = sent1Mod.startsWith("S",18); //true
        System.out.println(sent3City); //true
        System.out.println(sent1Name); //true

        System.out.println("Character.isUpperCase(sent1Mod.charAt(0)) = " + Character.isUpperCase(sent1Mod.charAt(0)));
        System.out.println("Character.isUpperCase(sent2Mod.charAt(0)) = " + Character.isUpperCase(sent2Mod.charAt(0)));
        System.out.println("Character.isUpperCase(sent3Mod.charAt(0)) = " + Character.isUpperCase(sent3Mod.charAt(0)));
        System.out.println("Character.isUpperCase(sent4Mod.charAt(0)) = " + Character.isUpperCase(sent4Mod.charAt(0)));
        System.out.println("Character.isUpperCase(sent5Mod.charAt(0)) = " + Character.isUpperCase(sent5Mod.charAt(0)));
        System.out.println("Character.isUpperCase(sent6Mod.charAt(0)) = " + Character.isUpperCase(sent6Mod.charAt(0)));
        System.out.println("Character.isUpperCase(sent7Mod.charAt(0)) = " + Character.isUpperCase(sent7Mod.charAt(0)));
        System.out.println("Character.isUpperCase(sent8Mod.charAt(0)) = " + Character.isUpperCase(sent8Mod.charAt(0)));
        System.out.println("Character.isUpperCase(sent9Mod.charAt(0)) = " + Character.isUpperCase(sent9Mod.charAt(0)));
        




    }
}
