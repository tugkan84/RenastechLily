package Day_7_Switch_Scanner;

import java.util.Scanner;

public class Topic_6_Scanners {
    public static void main(String[] args) {

        //scanner is a library under java
        //this library has ready methods that you can use it
        //         to be able to use this library we need to call them in our class
        //         and create object from the library

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
    }
}
