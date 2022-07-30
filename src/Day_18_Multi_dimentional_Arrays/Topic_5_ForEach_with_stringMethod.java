package Day_18_Multi_dimentional_Arrays;

public class Topic_5_ForEach_with_stringMethod {
    public static void main(String[] args) {
        //string is not a collection, it is an object,
        //so we can not use foreach loop iterate on every chars on a string

        String StName = "SERAY";
        char [] lt = StName.toCharArray();
        for (char each : lt){
            System.out.println(each);
        }
        String cool = "Java is Cool but it is hard";
        String[] wrd = cool.split(" "); //it will create a string array

        for (String each2 : wrd){
            System.out.println("Words are: "+each2);
        }

    }
}
