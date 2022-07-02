package Day_4_Operators;

public class LogicalOperations {
    public static void main(String[] args) {

    //And ---->&&
        // all items must be true

       boolean balls = (12>7) && (3<8) && (9==7);
        System.out.println(balls); //false

        boolean flowers = (true) && (3<=8) && (8!=9);
        System.out.println(flowers); //true

    //OR-----> ||
        // any of the operations is true, it will return true

        boolean flo = (9>11) || (6<9);
        System.out.println(flo); //true

        boolean shoes = ("Ziya"=="ziya") || ('C' == 'c');
        System.out.println(shoes); //false

    //NOT ----> !

        boolean cars = !("red" == "blue");
        System.out.println(cars); //true

        boolean Q = !(((4==5)||(7<9))&& ((8<=10)||(true)));
        System.out.println(Q);



    }
}
