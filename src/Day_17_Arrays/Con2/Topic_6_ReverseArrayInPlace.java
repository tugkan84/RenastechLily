package Day_17_Arrays.Con2;

import java.util.Arrays;

public class Topic_6_ReverseArrayInPlace {
    public static void main(String[] args) {

        int[] arr = {3,4,5,6,7,8,9,0,-12};
        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr)); //[-12, 0, 9, 8, 7, 6, 5, 4, 3]
        System.out.println();
    }
}
