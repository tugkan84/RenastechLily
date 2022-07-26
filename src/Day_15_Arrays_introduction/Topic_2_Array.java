package Day_15_Arrays_introduction;

import java.util.Arrays;

public class Topic_2_Array {
    public static void main(String[] args) {

        int [] arr = {3,5,6,7};
        //arr[2]; >>>>6
        System.out.println(arr[2]); //6
        //System.out.println(arr[7]); //err

        String [] st = {"Ziya" , "Sam" , "Bahar" , "Emrah","Elif"};
        System.out.println(st[3]); // Emrah

        float zz = 89;
        float[] fl = {34 , 87 , zz};
        System.out.println(fl[2]); //89.0

        System.out.println("---------------------------------");

        int [] numbers = {1,2,3,4,5,6,7,8,9,10};
        //number.length = size
        //number.length - 1 = index
        System.out.println(numbers.length); //     10>>>>>>size
        System.out.println(numbers.length-1); //    9>>>>> last index
        System.out.println(Arrays.toString(numbers));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("\t" +numbers[i]); //12345678910
        }
        //for (int i = 0; i <= numbers.length; i++) {
           // System.out.println(numbers[i]); // errr
        //}

        for (int i = 0; i <= numbers.length-1 ; i++) {
            System.out.print("\t" + numbers[i]); //12345678910
        }


    }
}
