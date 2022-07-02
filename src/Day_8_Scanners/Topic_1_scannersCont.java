package Day_8_Scanners;

import java.util.Scanner;

public class Topic_1_scannersCont {

    public static void main(String[] args) {

       // String s = "This is input"; ---->Scanner scanner = new Scanner(s)

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the sort number; ");
        //byte byteNumber = scanner.nextByte();
        short sh = scanner.nextShort();
        System.out.println("The number that user entered is: "+ sh);

        System.out.print("enter your int number: ");
        int in = scanner.nextInt();
        System.out.println("your number is: " + in);

        System.out.println("enter your double: ");
        double Do = scanner.nextDouble();
        System.out.println("your double is: "+ Do );

        System.out.println("enter your next float: ");
        float fl = scanner.nextFloat();
        System.out.println("Your float is: " + fl);

        //Strings : 1) next()------ 2)nextLine()



        }
    }


