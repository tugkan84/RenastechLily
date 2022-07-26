package Day_15_Arrays_introduction;

import java.util.Arrays;

public class Topic_4_Array_Example {
    public static void main(String[] args) {
        int[] numbers = new int[4]; //initialize it (SIZE)
        //   = {0,0,0,0};
/////////////MANUAL
//        numbers[0] = 3;
//        numbers[1] = 5;
//        numbers[2] = 90;
//        numbers[3] = 23;
        //numbers[4] that's the size  X not index

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 5;   //numbers[0] = 5
            //number[1] = 6
            //number[1] = 7
            //number[1] = 8
        }
        System.out.println(Arrays.toString(numbers));


    }
}
