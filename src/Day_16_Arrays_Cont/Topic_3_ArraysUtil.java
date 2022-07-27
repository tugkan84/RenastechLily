package Day_16_Arrays_Cont;

import java.util.Arrays;

public class Topic_3_ArraysUtil {
    public static void main(String[] args) {
        //arrays has utils
        int[] name = {3,4,5,2,1,-90,-230};
        for (int i = 0; i < name.length; i++) {
            System.out.print(name[i] + " "); //i want to value //3 4 5 2 1 -90 -230
        }
        System.out.println(Arrays.toString(name)); //[3, 4, 5, 2, 1, -90, -230]


        String[] stArray = {"Seray","Tugy","Birko"};
        System.out.println(Arrays.toString(stArray));//[Seray, Tugy, Birko]
    }
}
