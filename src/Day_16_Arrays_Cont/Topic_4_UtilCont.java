package Day_16_Arrays_Cont;

import java.util.Arrays;

public class Topic_4_UtilCont {
    public static void main(String[] args) {
//////Arrays.sort(); >>>>> increasing order
        int[] num = {90, 45, 35, -90, -1000, 400};
        Arrays.sort(num);
        System.out.println(Arrays.toString(num)); //[-1000, -90, 35, 45, 90, 400]

        String[] arr = {"Seray", "Tugy", "Birko"};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[Birko, Seray, Tugy]
    }
}
