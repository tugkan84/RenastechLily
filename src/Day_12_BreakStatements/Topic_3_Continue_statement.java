package Day_12_BreakStatements;

public class Topic_3_Continue_statement {
    public static void main(String[] args) {
        //If you run your code, if it contains "Continuous" , it will pas the iteration for loop

        // i want to print al the numbers between 0-10(not included)
        //but except num 3,6,9
        for (int i = 0; i < 10; i++) {
            System.out.println("Before" + i);
            if(i%3 ==0){
            //(i ==3 ||i==6 ||i==9) ==same
                continue;
            }
            System.out.println("after" + i);

        }
    }
}
