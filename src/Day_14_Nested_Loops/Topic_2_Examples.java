package Day_14_Nested_Loops;

public class Topic_2_Examples {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println("From the outer loop++ i value: " + i);

            for (int j = 1; j <=5 ; j++) {
                System.out.println("        From the inner loop++ j value" + j);

                for (int k = 0; k <= 5; k++) {
                    System.out.println("                    From the inner ++ k value + k");

                }
            }

        }
    }
}
