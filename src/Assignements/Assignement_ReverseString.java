package Assignements;

public class Assignement_ReverseString {
    //Interview Question :
    ////    (String) Reverse
    ////    Write a  program that can reverse  a String
    ////    Ex: Reverse("ABCDE"); ==> EDCBA
    public static void main(String[] args) {
        String str = "ABCDE";
        String reverse = "";
        for (int i = str.length()-1; i >=0 ; i--) {
            reverse += str.charAt(i);
        }
        System.out.println(reverse);
    }
}
