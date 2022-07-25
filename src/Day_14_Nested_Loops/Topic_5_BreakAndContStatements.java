package Day_14_Nested_Loops;

public class Topic_5_BreakAndContStatements {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) { //0 1 2

            System.out.println("From the outer loop i value: " + i); //

            for (int j = 0; j < 4; j++) { //0 >1 >2>3-- 0 >1 > 2> 3-- 0 >1 > 2>3

                if (i==2){ // // 0 1 2
                    break; // when i==2 it exit
                }
                System.out.println("From the inner loopj  "+j); //0-1-2-3--- 0-1-2-3--- 0-1-2-3
            }

        }
        System.out.println("-------------------"); // after i ==2 it writes


        int l = 0;
        while (l<4){
            if (l==2){ // //
                l++;
                continue; //
            }
            System.out.println("            From inner loop l value: "+l);
        }
    }
}
