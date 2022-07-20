package Day_13_WhileLoop;

public class Topic_1_WhileloopCont {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            //i++; //it printe from ------->1-10
            System.out.println("The values i : " + i);
            i++; // it is important to know when to increase i value -----> 9
        }

        int j = 0;
        while (j <= 10) { // it must go on until 10
            if (j == 8) {    // if it becomes 8 skip //---->it stuck it 8 because it doesn't know what it will add
                j += 2;// count 2's
                continue;
            } else {       //or
                System.out.println("the even numbers are " + j);// 0-2-4-6-10
                j += 2;
            }
        }
        int k = 0;
        while (k <= 10) {
            // System.out.println(k); // it writes 9
            if (k == 9) {
                break;
            } else {
                System.out.println(k); //0-8
                k++;
            }
        }


    }
}
