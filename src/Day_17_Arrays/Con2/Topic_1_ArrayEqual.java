package Day_17_Arrays.Con2;

import java.util.Arrays;

public class Topic_1_ArrayEqual {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4};
        int[] arr2 = {1,2,3,4};

        System.out.println(Arrays.equals(arr1,arr2)); //true
        boolean equal = Arrays.equals(arr1,arr2);
        System.out.println(equal); //true
    }
}
