package Day_8_Scanners;

import java.util.Scanner;

public class Topic_2_Next_NextLine {
    public static void main(String[] args) {
        // The Strings have 2 ways tio be scanned
        // 1) next() Code will read all  the inputs that can be number or chars, or anything you put in the consul
        // until it sees a space " ";
        // 2) NextLine()

        Scanner scanner = new Scanner(System.in);
        System.out.print("Put something on the console: ");
        String str = scanner.next();
        System.out.println("Your thing that you put: " + str);




    }
}
