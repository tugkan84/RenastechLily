package Day_17_Arrays.Con2;

import java.util.Arrays;

public class Topic_5_ArrayEx {
    public static void main(String[] args) {
        // write a code where it will all words in a string and put in to an array then lets revers

        String ex = "Tracy is cool";
        String[] exArr = ex.split(" ");
        System.out.println(Arrays.toString(exArr)); //[Tracy, is, cool]

        //{cool , is , Tracy}
//1.way
    String[] reverse = new String[exArr.length]; //{null,null,null}
    int k = 0;
        for (int i = exArr.length-1; i >=0 ; i--) {
            reverse[k] = exArr[i];
            k++;
        }
        System.out.println(Arrays.toString(reverse)); //[cool, is, Tracy]

        String reverst = "";
        for (int i = 0; i < reverse.length; i++) {
            reverst +=reverse[i]+" ";

        }
        System.out.println(reverst);
        reverst = reverst.trim();
        System.out.println(reverst);




    }
}
