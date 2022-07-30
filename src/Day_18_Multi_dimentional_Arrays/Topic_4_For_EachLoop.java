package Day_18_Multi_dimentional_Arrays;

import java.util.Arrays;

public class Topic_4_For_EachLoop {
    public static void main(String[] args) {

        int[] nums = {9, 4, 5, 6, 7};
        for (int each : nums) { //iterate collection
            System.out.print(each + " ");
        }

        String[] animals = {"horse", "cat", "dog"};
        for (String each1 : animals) {
            System.out.print("\n" + each1 + " ");
        }
        for (String each2 : animals) {
            if (each2.equals("cat")) {
                each2 = "spider"; ///NO CHANGES
            }
        }
        System.out.println(Arrays.toString(animals)); //[horse, cat, dog] // not changes


//CHANGE THE INDEX
        int i = 0;
        for (String each4 : animals) {
            if (each4.equals("cat")) {
                animals[i] = "Spider";
            }
            i++;
        }
        System.out.println(Arrays.toString(animals)); //[horse, Spider, dog]

    }
}
