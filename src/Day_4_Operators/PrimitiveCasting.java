package Day_4_Operators;

public class PrimitiveCasting {
    public static void main(String[] args) {

        //Casting from smaller size to bigger size is not an issue
        //from bigger to smaller, We have to specify

        int A = 300;
        byte B= (byte) A;
        System.out.println(B); //44

        byte number1 = 100;
        int number2 = number1;
        System.out.println(number2); //100

        byte number3 = (byte)number2;
        System.out.println(number3);

        int number5 = 4376838;
        long number6 = number5;

        long number7 = 57589696006L;
        int number8 = (int) number7;

        float number9 = 89.9f;
        double number10 = number9;

        int numberint = 39838383;
        float numberfloat = (float)numberint;
        System.out.println(numberfloat);


    }
}
