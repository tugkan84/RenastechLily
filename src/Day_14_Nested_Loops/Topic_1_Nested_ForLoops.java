package Day_14_Nested_Loops;

public class Topic_1_Nested_ForLoops {
    public static void main(String[] args) {
        // Loop{   outer loop
        //        codes
        //        loop{   inner loop
        //         codesnblocks
        //} }

        int week = 3;
        int days = 7;
        for (int i = 1; i <= week; i++) {
            System.out.println("Week " + i);
            for (int j = 1; j <= days; j++) {
                System.out.println("Day " + j);

            }
        }
    }
}
