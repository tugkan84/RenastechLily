package Day_9_Strings;

public class Topic1_Strings {

    public static void main(String[] args) {
        // by string literal ------> String str = "Class";                  //pool
        // by new keyword    ------> String str1 = new String("Class1");    //heap memory

        //String is an object that represents a sequence of characters.
        String str1 = "Hello"; // it is created in pool memory
        String str2 = "Hello"; // this won't create a news string under pool memory, it uses str1' s value


        //strings are immutable which means unchangeable.You can not modify it.
        str2 = "Helo";
        String str6 = "Helo";
        String str7 = new String("Helo");

        System.out.println(str2); //Helo
        System.out.println(str2 == str6);//true
        System.out.println(str6 == str7); //false-----> because they use different memory.






    }
}
