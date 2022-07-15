package Day_11_ForLoops;

import java.util.Scanner;

public class Topic_4_ForLoop_Example {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter a string: ");
        String FromScan = scanner.nextLine();
        int length = FromScan.length()-1;
        String result="";

        for (int i = 0; i <= length ; i++){
            if (FromScan.charAt(i) == 'A' || FromScan.charAt(i) == 'a'){
                result = FromScan.toUpperCase();
                System.out.println("1.= " + result);
            }else{
                result = FromScan.toLowerCase();
                System.out.println("2.= " + result);
            }
        }
        System.out.println(result);
    }
}
