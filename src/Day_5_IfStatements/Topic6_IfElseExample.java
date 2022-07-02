package Day_5_IfStatements;

public class Topic6_IfElseExample {
    public static void main(String[] args) {
        // the condition is to have high 6 ft
        // age younger <24

        String Person1Name = "Serdar";
        double Person1heights = 6.1;
        int Person1age = 21;
        if (Person1age < 24 && Person1heights > 6){
            System.out.println(Person1Name + " has the accepted for basketball");
        }else{
            System.out.println(Person1Name + " is not qualified.");
        }
    }
}
