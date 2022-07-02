package Day_3_AritmaticOperations;

public class AritmaticOperations {

    public static void main(String[] args) {

////////////addition(+) used add numbers
        int number1 = 10;
        int number2 = 20;
        float numberf1 = 40.7f;
        double numberdouble = 76.9873;
        long numberlongle = 473749378403L;


        int number3 = number1 + number2;
        float number4 = number1 + numberf1;
        float num1 = 10.6f;
        float num2 = 5.4f;

        System.out.println(num1+num2); //16.0
        System.out.println(number3); //30
        System.out.println(number1+number2); //30
        System.out.println(number4); //50.7



/////////////subtraction(-) used
        int num4 = 50;
        int num5 = 70;
        int num6 = num4-num5;

        int num7 = 80;
        float num8 = 90.6f;
        float num9 = num7 - num8;

        long num10 = 769894L;
        int num11 = 786;
        long num12 = num10+num11;


        System.out.println(num7-num8); //-10.5999998
        System.out.println(num6); //-20
        System.out.println(num4-num5); //-20

///////////multiplication(*)
        int multi1 = 20;
        int multi2 = 30;
        int multi3 = multi1*multi2;

        System.out.println(multi1*multi2); //600
        System.out.println(multi3);//600

//////////division(/)
        int divis1 = 60;
        int divis2 = 30;
        int divis3 = divis1/divis2;

        System.out.println(divis3); //2

        int divis4 = 4;
        int divis5 = 3;
        int divis6 = divis4/divis5;
        System.out.println(divis6); //1

        float divis7 = divis4/divis5;
        System.out.println(divis7); //1.0
        float divis8 = (float) divis4/divis5;
        System.out.println(divis8);//1.33333
        System.out.println((float) divis4/divis5); //1.33333

//////// modulus(%)  gives reminder
        int mod1 = 10;
        int mod2 = 5;

        int mod3 = 10%5;
        System.out.println(mod3);//0

        int mod4 = 11;
        int mod5 = 5;
        System.out.println(mod4&mod5); //1

        float mod6 = 5.8f;
        int mod7 = 2;
        float mod8 = mod6%mod7;
        System.out.println(mod8);//1.8000000



    }

}

