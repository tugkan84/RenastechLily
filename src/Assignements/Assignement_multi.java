package Assignements;

public class Assignement_multi {
    ////Write a program to display the multiplication table from 1 to 10. Please use nested for loop:
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print("\t\t"+i + " * " + j + " = " + (i * j));
               // System.out.println();
            }
            System.out.println();
        }
    }
}
