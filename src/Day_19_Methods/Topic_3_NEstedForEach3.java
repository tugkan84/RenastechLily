package Day_19_Methods;

public class Topic_3_NEstedForEach3 {
    public static void main(String[] args) {
        int[][][] array3 = {{{56}, {78, 98, 9, 23}, {93, 24, 56}}, {{89, 90, 23}}, {{87, 45, 6}, {0, 1}}, {{90, 23, 4}, {1, 2}, {45, 6}}};
        //                             0                                 1               2                             3
        //                    0           1             2                0               0          1            0        1      2
        //                    0       0 1  2  3        0  1  2         0  1  2       0 1 2         0 1        0 1 2        0 1   0 1
        int size = array3.length;
        int a = array3[3][0][0];
        System.out.println(a); //90

        for (int[][] arr2 : array3) {
            for (int[] arra1 : arr2) {
                for (int ar : arra1) {
                    System.out.print(ar + ",");//56,78,98,9,23,93,24,56,89,90,23,87,45,6,0,1,90,23,4,1,2,45,6,
                }
            }
        }
    }
}
