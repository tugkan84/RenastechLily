package Day_18_Multi_dimentional_Arrays;

public class Topic_6_ForEachEx {
    public static void main(String[] args) {
        int[] nums = {5,6,7,3,4,2,3,4,5,6,7,90,76,55,77,33,23,21,45,67,89};
        //write a code where you sum all the even numbers in the array as EvenSum
        //using same array calculate the sum of all the odd number in the array as OddSum

        int EvenSum = 0;
        int OddSum = 0;
        for (int each : nums){
            if(each %2 ==0){
                EvenSum +=each;
                System.out.println("The evens: "+each);
            }
            else{
                OddSum +=each;
                System.out.println("The odds: "+each);
            }
        }
        System.out.println("The sum of all even numbers in array: "+EvenSum); //The sum of all even numbers in array: 188
        System.out.println("The sum of all odd numbers in array: "+OddSum); //The sum of all odd numbers in array: 440

    }
}
