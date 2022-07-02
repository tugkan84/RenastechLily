package Day_8_Scanners;

import java.util.Scanner;

public class Topic_3_NextLine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a something with Space: ");
        String butter = scanner.nextLine();
        System.out.print("The thing thay you entered is: "+butter);


    }
}
