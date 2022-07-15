package Assignements;

public class Assignements_Sum_even {
    //////Write a program that will print the sum of the even numbers
    // between 0-20 * include . Please use for loop and if statement.
    public static void main(String[] args) {
        int SumEven = 0;
        for (int i = 0; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i+ " ");
                SumEven += i;
            }
        }
        System.out.println("\nSum of the numbers: " + SumEven);

    }
}
