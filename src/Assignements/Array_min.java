package Assignements;

public class Array_min {
    //Write a code with following requirements:
    //- Define an array with values of {6,7,2,3,90,-2,-90,-122,96,35}
    //- Print the minimum number in the given array
    public static void main(String[] args) {
        int[] arr = {6,7,2,3,90,-2,-90,-122,96,35};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("The min number of Array: "+min);
    }
}
