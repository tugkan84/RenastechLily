package Day_13_WhileLoop;

public class Topic_6_DowhileExample {
    public static void main(String[] args) {

        // sum all the even numbers 0-100(included)

//        int i = 0;
//        int total = 0;
//        do {
//            total += i;
//            i += 2;
//
//        } while (i <= 100);
//        System.out.println("Sum of the even numbers are: " + total);

// different version
        int k = 0;
        int totaly = 0;
        do {
            if (k == 10) {
                k += 2;
                continue;
            }
            if (k == 100) {
                break;
            }
            totaly += k;
            k += 2;

        } while (k <= 15);
        System.out.println("Sum of the even numbers are: " + totaly);

    }
}
