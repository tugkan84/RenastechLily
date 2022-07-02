package Day_6_ifElseConditions;

public class Topic6_Nested_if {
    public static void main(String[] args) {

        //nested if Statements
        // if number is 0 just print
        // if number is even and less than 50 double it
        // if number is odd and less than 70 triple it

        int number = 75;
        if (number == 0) {
            System.out.println("The number is: " + number);
        } else if (number % 2 == 0) {
            if (number < 50) {
                number = number * 2;
            } else {
                number = number * 4;
            }
        } else {
            if (number < 70) {
                number = number * 3;
            } else {
                number = number * 6;
            }
        }
        System.out.println(number);


        boolean hasValidEmail = true;
        String username = "sera123";
        String password = "12345";

        if (hasValidEmail){
            if (username == "sera123" && password == "12345"){
                System.out.println("Welcome to Amazon");
            }else{
                System.out.println("Password or username is not correct");
            }
        }else{
            System.out.println("there was a problem");
        }
    }
}
