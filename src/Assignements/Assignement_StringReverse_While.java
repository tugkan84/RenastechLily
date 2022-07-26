package Assignements;

public class Assignement_StringReverse_While {
    //////Create a program that will reverse a string , Please use While loop.
    public static void main(String[] args) {
        String name= "Seray";
        String reversed ="";
        int indexnumber =name.length()-1;
        while (indexnumber>=0 ){
            reversed += name.charAt(indexnumber);
            indexnumber--;
        }
        System.out.println(reversed);
    }
}
