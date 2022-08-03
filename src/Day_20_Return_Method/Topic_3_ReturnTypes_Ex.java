package Day_20_Return_Method;

public class Topic_3_ReturnTypes_Ex {
    //write a method where it gets an Array of int input parameter and
    // returns to the max number in array
    public static void main(String[] args) {
        int[] arr1 = {-90, -30, -20, 0};
        int maximum = MAxNumber(arr1);
        System.out.println(maximum);

        // add some number to max value;

        int addedVersion = MAxNumber(arr1)+5;
        System.out.println("added version is: "+addedVersion); //0+5

    }

    public static int MAxNumber(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {  // for(int each: arr){
            if (arr[i] > max) {                 //if(each> max)
                max = arr[i];                   // max= each
            }                                   // }
        }
        return max;
    }
}
