package Day_18_Multi_dimentional_Arrays;

import java.util.Arrays;

public class Topic_2_MultiArrays_ex {
    public static void main(String[] args) {
        String[][] stNames = {{"Bahar", "Gulay"}, {"Ziya"}, {"Raz", "Kubra", "Sarp"}, {"Sam", "Airevan"}}; //the size of 1 array is =4 element
        //         0              1              2                3
        //                         0     1         0        0     1        2      0         1
        //in order to get Airevam [3][1]
        System.out.println(stNames[3][1]);  //Airevan
        int[] one = new int[3]; //{0,0,0}
        int[][] two = new int[3][3]; //{ {0,0,0},{0,0,0},{0,0,0}};

        // replce initial values with 5 ( 2 times turn)
        // { {5,5,5},{5,5,5},{5,5,5}};
        for (int i = 0; i < two.length; i++) {
            for (int j = 0; j < two[0].length; j++) { //two[0] two[1] two[2] has same size
                two[i][j] = two[i][j] + 5;
            }
        }
        for (int i = 0; i < two.length; i++) {
            for (int j = 0; j < two[0].length; j++) { //two[0] two[1] two[2] has same size
                System.out.println("The index i: " + i + "\tthe index j: " + j + " \tthe value: " + two[i][j]);
            }
        }
    }
}
