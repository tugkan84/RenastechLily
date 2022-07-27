package Assignements;

import java.util.Arrays;
import java.util.Scanner;

public class Assignement_array_avearge {
    //Write a code where user is asked to enter for 5 employee salaries and store those salaries
    //Then find the average salary of those 5 employees
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter 5 Employee's salaries");
        double[] salaries = new double[5];
        double sum = 0;

        int i = 0;
        while (i < 5) {
            System.out.print("Please enter " + (i + 1) + ". number:  ");
            double salary = scanner.nextDouble();
            salaries[i] = salary;
            i++;
        }
        for (int j = 0; j < salaries.length; j++) {
            sum += salaries[j];
        }
        double averageSal = sum / salaries.length;

        System.out.println(Arrays.toString(salaries));
        System.out.println("The aveage of salaries is: "+averageSal);

    }
}
