package Day_12_BreakStatements;

public class Topic_5_WhileLoop {
    public static void main(String[] args) {
        // the concept of while loop
        //starting point isn't required
        // we define to starting point before the "While"
        // You have the end point in the while(End point)
        // you have the iteration inside the curly brackets
        //step by step
        // int i = 0
        // While(condition i<10)  {
        // i++ or i-- or i+=10...
        //  }

        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
        }
        System.out.println("\n-------");
        int i = 0;
        while (i<10){
            System.out.print(i +" ");
            ++i;
        }
        int k = 0;
        while (true){
            //System.out.println(" k " + k); //infinite
            i++;
        }



    }
}
