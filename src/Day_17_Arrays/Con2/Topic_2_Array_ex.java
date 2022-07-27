package Day_17_Arrays.Con2;

import java.util.Arrays;

public class Topic_2_Array_ex {
    public static void main(String[] args) {
        // adding two arrays into one
        int[] arr1 = {2,3,4,5};
        int[] arr2 = {2,4,5,6,7};
       //  int[] arr3 = arr1+arr2; You can not do this

        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size]; // {0,0,0,0,0,0,0,0,0}

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        //arr3 = {2,3,4,5,0,0,0,0,0}
        int k = 0;
        for (int i = arr1.length; i < size; i++) {
            arr3[i] = arr2[k];
            k++;
        }
        //for (int i = 0; i < arr2.length; i++) {
        //    arr3[(arr1.length-1)+i] = arr2[i];
        //}
        System.out.println(Arrays.toString(arr3)); //[2, 3, 4, 5, 2, 4, 5, 6, 7]

    }
}
