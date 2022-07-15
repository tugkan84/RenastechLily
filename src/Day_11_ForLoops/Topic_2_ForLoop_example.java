package Day_11_ForLoops;

public class Topic_2_ForLoop_example {
    //write a code where the code print all the even numbers between zero 0-100;(100 included
    // if a number is divided by 2 with no reminder then it is even number

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println("\nThe count is: " + count);

        int countx = 0;
        //this is the 2 way
        for (int j = 0; j <= 100; j += 2) {
            System.out.print(j + " ");
            countx++;
        }
        System.out.println("\n" + countx);

    }
}
