package Assignements;

import java.util.Arrays;

public class Array_descending_order {
    //Write a code where you sort all the integer values
    //in an array in descending order (Do not use the Arrays.sort() )

    public static void main(String[] args) {
        int[] numbers = {1,2,3,67,90,-8, 76,45,99,23,-100,7890};
        int temp=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i]>numbers[j]){
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));

    }
}
