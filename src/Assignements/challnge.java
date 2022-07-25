package Assignements;

import java.util.Scanner;

public class challnge {
    public static void main(String[] args) {
        double we = 0;
        double sn = 0;
        Scanner scan = new Scanner(System.in);
        //we    w + e -
        //sn    s + n -
        boolean ask = true;
        while (ask) {
            System.out.println("press '0' to calculate:");
            System.out.println("Please enter miles:");
            double miles = scan.nextDouble();
            if (miles == 0) {
                double result = (double) Math.sqrt((we * we) + (sn * sn)); // calculate hypotenuse
                System.out.println(result);
                break;
            }
            System.out.println("pls enter direction:");
            String direction = scan.next();

            switch (direction.toLowerCase()) {
                case "w":
                    we += miles;
                    break;
                case "e":
                    we -= miles;
                    break;
                case "s":
                    sn += miles;
                    break;
                case "n":
                    sn -= miles;
                    break;
                default:
                    break;
            }
        }
    }
}
