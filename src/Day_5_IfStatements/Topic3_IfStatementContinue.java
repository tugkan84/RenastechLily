package Day_5_IfStatements;

public class Topic3_IfStatementContinue {
    public static void main(String[] args) {
        // Let's define 3 different numbers
        // we will print the max num
        // write a code where it compares 3 dif numbers and prints the max num

        int num1 = 99;
        int num2 = 27;
        int num3 = 189;

        boolean bool1 = num1>num2 && num1>num3;
        boolean bool2 = num2>num1 && num2>num3;
        boolean bool3 = num3>num1 && num3>num2;

        if (bool1){
            System.out.println("The max number is: "+ num1);
        }
        if (bool2){
            System.out.println("The max number is: "+ num2);
        }
        if (bool3){
            System.out.println("The max number is: "+ num3);
        }


    }
}
