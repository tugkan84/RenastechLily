package Day_6_ifElseConditions;

public class Topic3_TernaryExample {

    public static void main(String[] args) {
        //Check the number if it is even or odd

        int num = 90;
        String result;

        if (num % 2 == 0) {
            result = "Even";
        } else result = "odd";
        System.out.println("The result is " + result);

        result = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(result);


    }
}
