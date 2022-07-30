package Day_18_Multi_dimentional_Arrays;

public class Topic_1_Multi_arrays {
    public static void main(String[] args) {
        //Arrays having arrays as values or having multiple array nested inside each other
        //Data type [] [] [] name = {};
        int[][] name1 = { {12,34,56,78} , {78,89,23,11} };
        //index outer =       0                   1
        //index inner =    0  1  2  3       0  1  2  3

        System.out.println(name1[1][1]); //89

        int[][][] name2 = { { {5,5,6,7,3,7 },{0,5,6,7,2,4} } ,{ {0,7,8,5,3,7},{23,65,4874} },{ {0,54,67,89} } };
        //outer         =          0                                    1                              2
        //inner         =          0                1                   0            1                 0
        //very inner    =      0,1,2,3,4, 5   0,1,2,3,4,5,        0,1,2,3,4,5      0,1,2            0,1,2,3
    }
}
