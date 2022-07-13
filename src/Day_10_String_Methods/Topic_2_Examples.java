package Day_10_String_Methods;

import java.util.Scanner;

public class Topic_2_Examples {
    public static void main(String[] args) {
        /* - User is asked to put a valid email(username)
           - Enter a password where the password is at last 9 char
           -
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a valid email address: ");
        String email = scanner.nextLine();

        System.out.print("Enter a valid password: ");
        String password = scanner.next();
        String formattedEmail = email.toLowerCase();

        if (formattedEmail.length() > 10 && formattedEmail.contains("@gmail.com")) {
            if (!(formattedEmail.startsWith("@")) && formattedEmail.endsWith("@gmail.com")) {
                System.out.println("Email is valid");
            }else{
                System.out.println("Email is invalid");
            }
        }
        if (password.length() >= 9) {
            System.out.println("password is valid");
        } else {
            System.out.println("password is invalid");
        }
    }
}
