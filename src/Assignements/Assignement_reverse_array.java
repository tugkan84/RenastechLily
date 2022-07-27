package Assignements;

import java.util.Arrays;
import java.util.Collections;

public class Assignement_reverse_array {
    ////Write   a   Java   program   to   reverse   the   element   of   an   integer    array.
    public static void main(String[] args) {
//first type:
        int[] numbers = {1, 2, 3, 4, 5, 6};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
         }
//second type:
        int[] nums = {1, 2, 3,4,5,6};
        int temp = 0;
        int length = nums.length-1;
        for (int i = 0; i < nums.length/2; i++) {
            temp = nums[i];
            nums[i] = nums[length - i];
            nums[length -i] = temp;
        }
        System.out.println("\n"+Arrays.toString(nums));


    }
}



