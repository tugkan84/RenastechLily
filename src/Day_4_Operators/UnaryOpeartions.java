package Day_4_Operators;

public class UnaryOpeartions {
    public static void main(String[] args) {
    //unary plus(+) it does NOT have any effect on the number

        int number = 10;
        number = +number;
        System.out.println(number);//10

        int number1= -10;
        number1 = +number1;
        System.out.println(number1); //-10

    //Unary minus(-) it will change the sign or the value to be opposite

        int number2 = -20;
        number2= -number2;
        System.out.println(number2); //20

        int number3 = 30;
        number3 = -number3;
        System.out.println(number3); //-30

    //increment operators(++) increase the numbers by 1
        int number4 = 8;
        number4++; // number4 + 1 =9
        System.out.println(number4);

    //decrement operator(--) decrease the numbers by 1

        int number5 = 30;
        number5--; //number5 - 1
        System.out.println(number5); //29

    // Invert (!) it invert the boolean values. If it is true,become false; if it is false , become true.

        boolean bool = true;
        bool = !bool;
        System.out.println(bool); // false





    }
}
