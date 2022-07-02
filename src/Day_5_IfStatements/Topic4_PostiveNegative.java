package Day_5_IfStatements;

public class Topic4_PostiveNegative {
    public static void main(String[] args) {
        //we want to check if the number positive, negative or 0

        int number = -1;

        if (number > 0){
            System.out.println("The number : "+ number + " is positive.");
        }
        if (number < 0){
            System.out.println("The number : "+ number + " is negative.");
        }
        if (number == 0){
            System.out.println("The number : "+ number + " is Zero");

        }
    }
}
