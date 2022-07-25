package Assignements;

public class Assignement_StringReverse_While {
    //////Create a program that will reverse a string , Please use While loop.
    public static void main(String[] args) {
        String name= "Seray";
        String reversed ="";
        int i =name.length()-1;
        while (i>=0 ){
            reversed += name.charAt(i);
            i--;
        }
        System.out.println(reversed);
    }
}
