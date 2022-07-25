package Day_14_Nested_Loops;

public class Topic_6_Break_Cont_Outer {
    public static void main(String[] args) {
        label: //it's just a label - name
        for (int i = 0; i < 3; i++) { //0
            System.out.println("Outer loop i value: "+i); //0
            for (int j = 0; j < 3; j++) { //0 //1 //2

                if (j==2){//
                    break label; //exit comple because label
                }
                System.out.println("From the inner lop j value: "+j); //0 //1
            }
        }
    }
}
