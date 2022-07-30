package Day_15_Arrays_introduction;

import java.util.Arrays;

public class Topic_5_Array_Max_Number {
    public static void main(String[] args) {
        //find the max number in array of int
        int[] arr = {-5,-98,-3,-56,-23,-7};
        int max = Integer.MIN_VALUE;
        //int max = arr[0]; //5
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println(max); //98
//Second way
        Arrays.sort(arr);
        System.out.println(arr[arr.length-1]); //98
    }
}
