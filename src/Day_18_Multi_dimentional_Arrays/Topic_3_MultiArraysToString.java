package Day_18_Multi_dimentional_Arrays;

import java.util.Arrays;

public class Topic_3_MultiArraysToString {
    public static void main(String[] args) {
        String[] stNames = {"Sam" , "Rachael" , "Sarp"};
        System.out.println("Single array: "+Arrays.toString(stNames)); //Sam, Rachael, Sarp]

        String[][] twoNames = {{"ziya","Allen"},{"Elif","Seray"}};
        System.out.println("the first array inside of big array: "+ Arrays.toString(twoNames[0]));
        System.out.println("the second array inside of big array: "+ Arrays.toString(twoNames[1]));

        //using Arrays.deepToString
        System.out.println(Arrays.deepToString(twoNames)); //[[ziya, Allen], [Elif, Seray]]

        int[][][] three = {{{8,5,6,2},{3,90}},{{34,78,91},{1}}};
        System.out.println(Arrays.deepToString(three)); //[[[8, 5, 6, 2], [3, 90]], [[34, 78, 91], [1]]]
    }
}
