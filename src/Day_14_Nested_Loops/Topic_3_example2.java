package Day_14_Nested_Loops;

public class Topic_3_example2 {
    public static void main(String[] args) {
        //staring numbers
        //ascending
        for (int i = 0; i < 7; i++) {
            System.out.print("i value"+i+" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
        System.out.println("***************");
        //descending
        for (int i = 7; i >=0; i--) {
            System.out.print("i value"+i+" ");
            for (int j = 0; j <= i; j++) {
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
