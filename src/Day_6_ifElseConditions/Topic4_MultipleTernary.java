package Day_6_ifElseConditions;

public class Topic4_MultipleTernary {
    public static void main(String[] args) {
        // number is 0 : says 0
        // even; even
        //odd;odd

        int num = 40;
        String result;
        result = (num == 0) ? "Zero" : (num % 2 == 0) ? "Even" : "Odd";
        System.out.println("The result of your num " + num + " " + result);
    }
}
