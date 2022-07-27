package Assignements;

import java.util.Arrays;

public class Assignement_Array_shifted {
    public static void main(String[] args) {
        //Write code where it shifts all the elements in array by one index and
        //put the first index at the end of the array
        //example array = {2,3,4,5,6,7,8,9} ===> shifted array = {3,4,5,6,7,8,9,2}
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9};
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                arr[i - 1] = arr[i];
               //System.out.println(Arrays.toString(arr)); // for seeing the change in array
            }
            if (i == arr.length - 1) {
                arr[i] = temp;
            }
        }
        System.out.println(Arrays.toString(arr)); //[2, 3, 4, 5, 6, 7, 8, 9]

    }

}

