package Day_16_Arrays_Cont;

import java.util.Arrays;

public class Topic_2_Example {
    public static void main(String[] args) {
        //if i want to swap the elements in array

        int[] swap = {30, 90};
        int temp = swap[0];
        swap[0] = swap[1];
        swap[1] = temp;

        System.out.println(Arrays.toString(swap)); //[90, 30]

        String[] swapp = {"Seray", "Tugy"};
        String tempp = swapp[0];
        swapp[0] = swapp[1];
        swapp[1] = tempp;
        System.out.println(Arrays.toString(swapp)); //[Tugy, Seray]

    }
}


