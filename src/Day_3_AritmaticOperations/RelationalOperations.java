package Day_3_AritmaticOperations;

public class RelationalOperations {
    public static void main(String[] args) {

        int number = 10;
// == (equal)--------------> true or false

        boolean b1 = 10==10;
        System.out.println(b1);//true

        boolean b2 = "seray"=="seray";
        System.out.println(b2); //true

        boolean b3 = "seray" == "Seary";
        System.out.println(b3);//false

// >= checks 2 things and if it is greater or equal

        boolean b4 = 12>=10;
        System.out.println(b4); //true

//<= checks 2 things less or equal

        boolean b5 = 14<=50;
        System.out.println(b5); //true

        boolean b6 = 17<=16;
        System.out.println(b6); //false

//!= not equal
        boolean b7 = 14 != 14;
        System.out.println(b7); //false

        boolean b8 = 27 != 23;
        System.out.println(b8); //true

// > greater than
        boolean b9 = 14>15; //false
        boolean b10 = 30>20; //true

// < less than

        boolean b11 = 11<9000; //true
        boolean b12 = 900<100; //false

        boolean b13 = !(true ==false);
        System.out.println(b13); //true

// !
        boolean b15d = !((true==false) == !(10<=11));
        System.out.println(b15d); //false


           //                true                             true
                     // false        false         false        true
        boolean b15 = !(('c'== 'C')==(13==14)==!(("er"=="ER")==(true==true)));
        System.out.println(b15);








    }
}
