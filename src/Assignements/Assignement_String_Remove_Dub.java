package Assignements;

import java.util.LinkedHashSet;

public class Assignement_String_Remove_Dub {
    public static void main(String[] args) {
        //NTERVIEW QUESTION
        ////    (String) Remove Duplicates
        ////    Write a return method that can remove the duplicated values from String
        ////    Ex:  removeDup("AAABBBCCCDDD")  ==> ABCD

        String str1 = "AAABBBCCCDDDEE";
        System.out.println(RemoveDub(str1));
        System.out.println(RemoveDublicate2(str1));
    }

    public static String RemoveDub(String str) {
        StringBuilder removedDublicate = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (removedDublicate.toString().indexOf(str.charAt(i)) < 0) {
                removedDublicate.append(str.charAt(i));
            }
        }
        return removedDublicate.toString();
    }

    public static String removeDup(String str) {

        char[] strChar = str.toCharArray();
        LinkedHashSet<Character> result = new LinkedHashSet<Character>();
        for (char each : strChar)
            result.add(each);

        StringBuilder str2 = new StringBuilder();
        for (Character character : result) {
            str2.append(character);
        }
        return str2.toString();

    }

    public static String RemoveDublicate(String str) {
        String removedDub = "";
        for (int i = 0; i < str.length(); i++) {
            if (removedDub.indexOf(str.charAt(i)) < 0) {
                removedDub += str.charAt(i);
            }
        }
        return removedDub.toString();
    }

    public static String RemoveDublicate2(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (!(result.contains("" + str.charAt(i)))) {
                result += str.charAt(i) + "";
            }
        }
        return result;
    }
}
