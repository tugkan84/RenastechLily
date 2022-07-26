package Day_15_Arrays_introduction;

public class Topic_3_array_cont {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(nums[0]); //1
        nums[0] = 11;
        System.out.println(nums[0]); //11

        //int[] numbers = new int[10]; // java will create an array that has a default values for each index
        // for the numbers the default values are 0,(int byte,long)0.0(float, double)
        int[] numbers = new  int[10]; //{0,0,0,0,0,0,0,0,0,0}
        String[] st = new String[3]; // {null,null,null}  >>>> null=nothing
        char[] CH = new char[4]; //      { , , , ,}       >>>> just spaces
        System.out.println(numbers[0]); //0
        System.out.println(st[0]);      //null
        System.out.println(CH[0]);      //space

        boolean[] bool = new boolean[2]; // {false, false} >>>>>> default value is FALSE
        System.out.println(bool[0]);    //false
    }
}
