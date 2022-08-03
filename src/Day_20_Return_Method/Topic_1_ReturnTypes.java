package Day_20_Return_Method;

public class Topic_1_ReturnTypes {
    public static void main(String[] args) {

        // anywhere of your application or program, public is accessible from everywhere
        int[] arr = {3, 4, 5, 6, 7, 8, 9};
        Count(arr); //when count works it calls everything inside it
        Sum(arr); //The sum of all the items int the array is: 42


    }

    public static int Count(int[] name) {
        int result =0;
        //System.out.println("The count of items in the array is: " + name.length);
        result = name.length;
        return result;
        //Count(name); //Recursive call
//        int[] name2 = {2, 3, 4};
//        Sum(name2);

    }

    public static int Sum(int[] name1) {
        int sum = 0;
        for (int each : name1) {
            sum += each;
        }
        System.out.println("The sum of all the items int the array is: " + sum);
        return sum;
    }
}
