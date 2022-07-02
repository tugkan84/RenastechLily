package Day_6_ifElseConditions;

public class Topic2_Ternary {
    public static void main(String[] args) {
        // write a code where it checks 2 numbers and assign the bigger to variable called max
        int num1 = 50;
        int num2 = 70;
        int max;

        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        System.out.println("The max is " + max); //num2
        //Ternary
        max = (num1 > num2) ? num1 : num2;
        System.out.println("The max is " + max); //num2


    }
}
