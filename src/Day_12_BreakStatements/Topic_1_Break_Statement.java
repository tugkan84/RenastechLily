package Day_12_BreakStatements;

public class Topic_1_Break_Statement {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello, Hello");
            if (i == 5) {
                System.out.println("Hello world");
            }
        }
        //break statement

        for (int i = 0; i <= 10; i++) {
            System.out.println("Hello ");
            System.out.println(i);
            if (i == 5) {
                break;
            }
        }
        for (int i = 0; i < 300; i++) {
            System.out.println("speed: " + i);
            if (i == 75) {
                System.out.println("ticket");
                break;
            }

        }

        for (int i = 1; i < 9; i++) {
            // System.out.println(i);

            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
                break;
            }

        }
        for (int i = 9; i >= 0; i--) {
            if (i % 5 == 0) {
                break;
            }
            System.out.println(i);

        }
        System.out.println("********************");

        for (int k = 0; k < 10; k += 2) {
            //   k=0        0<10     0+2
            //   k=2         2<10     2+2
            //   k=4         k<10     4+2
            //System.out.println(k); //0 2 4 6 8
            if (k == 4) {
                break;
            }
            System.out.println(k);
        }
        System.out.println("Hello");


    }
}
