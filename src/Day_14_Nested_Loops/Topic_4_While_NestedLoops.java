package Day_14_Nested_Loops;

public class Topic_4_While_NestedLoops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 2) { //o 1
            System.out.println("From the outerloop i  value: " + i); /// //
            int j = 0;
            while (j < 2) { //0<2 1<2  > 0<2 1<2
                System.out.println("            From inner loop j value: " + j);// // // //
                j++; //1 2
            }
            i++; //1 2
        } /*From the outerloop i  value: 0
              From inner loop j value: 0
              From inner loop j value: 1
            From the outerloop i  value: 1
              From inner loop j value: 0
              From inner loop j value: 1 */

        int k = 0;
        while (k <3){ //0 //1 //2
            System.out.println("From the while loop, Outer k value: "+k);//
            for (int l = 0; l < 3; l++) { //0 1 2 > 0 1 2 > 0 1 2
                System.out.println("            From inner for loop l value: "+l);//// ///
            }
            k++; //1 2 3
                       //exit
        }  /*From the while loop, Outer k value: 0
            From inner for loop l value: 0
            From inner for loop l value: 0
            From inner for loop l value: 0
            From the while loop, Outer k value: 1
            From inner for loop l value: 1
            From inner for loop l value: 1
            From inner for loop l value: 1
            From the while loop, Outer k value: 2
            From inner for loop l value: 2
            From inner for loop l value: 2
            From inner for loop l value: 2 */

        for (int j = 0; j < 3; j++) { //0 //1 //2
            System.out.println("However- from the loop" + j); //
            int f = 0;
            while (f<2){ //0-1 >> 0-1> 0-1
                System.out.println("whatver: - while loop" + f);//////
            f++; //1 //2 //3
            } //exit

        }

    }
}
