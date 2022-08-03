package Day_20_Return_Method;

public class Topic_2_MethodsReturnTypesParametres {
    public static String Name(int a, int b) {

        if (a > b) {
            return "Ser";
        } else if (b > a) {
            return "Jason";
        } else {
            return "";
        }
    }


    public static void main(String[] args) {
        String name = Name(3, 5);
        System.out.println(name);
    }
}