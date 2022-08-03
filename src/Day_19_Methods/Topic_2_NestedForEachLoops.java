package Day_19_Methods;

import java.util.Arrays;

public class Topic_2_NestedForEachLoops {
    public static void main(String[] args) {
        int[][] two = {{1, 2, 4, 67, 90}, {98, 34, 23, 31}, {1, 3}, {78}};
        int size = two[0].length;  //5
        System.out.println(size);
        int size1 = two[1].length; //4
        System.out.println(size1);
        int size2 = two[2].length; //2
        System.out.println(size2);
        int size3 = two[3].length; //1
        System.out.println(size3);


        System.out.println(Arrays.deepToString(two)); //[[1, 2, 4, 67, 90], [98, 34, 23, 31], [1, 3], [78]]
////instead of using Arrays.deepToString()
        for (int[] each : two) { // look into 2 dimension array
            for (int a : each) {  // look into array's inside
                System.out.print(a + " "); //1 2 4 67 90 98 34 23 31 1 3 78
            }
        }


    }
}
