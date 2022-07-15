package Day_11_ForLoops;

public class Topic_1_ForLoopContinoue {
    public static void main(String[] args) {
        //write a for loop that increase by 2's for each iteration;
        int count= 0;
        for (int i = 1; i <100 ; i+=2) {
            count++;
        }
        System.out.println(count); //50

        System.out.println("************");

        int count2 = 0;
        int j;
        for (j = 1; j < 100; j+=2) {
            count2++;
        }
        System.out.println(count2);//50

        //System.out.println(j); //101


    }
}
