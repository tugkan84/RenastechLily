package Day_9_Strings;

public class Topic2_String_Methods {
    public static void main(String[] args) {

//charAt()------------>Returns the character at specified index  ----->chat
        String str = "Renas";
        char firstLetter = str.charAt(0);
        System.out.println(firstLetter); //R

//concat()---------->Appends a string to the end of another string--------->String
        String str1 = "name0";
        String str2 = "name1";
       // String str3 = str1 +str2;
        String str3 = str1.concat(str2);
        System.out.println(str3);    //name0name1

//contains()-------> checks whether as string contains a sequence of characters------>boolean
        String name1 = "Gulay";
        boolean YN = name1.contains("Gulay");
        System.out.println(YN); //true
        boolean ny = name1.contains("gulay");
        System.out.println(ny); //false

//endsWith() ------>checks whether as string ends with a sequence of characters------>boolean
        boolean YN1 = name1.endsWith("ay");
        System.out.println(YN1); //true

        System.out.println(name1.endsWith("loay")); //false

//equals()-------->compare 2 strings.Returns true if the strings are equal and false if not----->boolean
        String name2 = "Sam";
        String name3 = "sam";
        boolean YN3 = name2.equals(name3);
        System.out.println(YN3);            //false
        System.out.println(name2 == name3); //false

//equalsIgnoranceCase() -----> Compare 3 strings, ignoring case consideration----->boolean
        boolean YN4 = name2.equalsIgnoreCase(name3);
        System.out.println(YN4); //true

//indexOf()------>returns the position of the first found occurrence of specified characters in a string--->int

        String name5= "banana";
        int index = name5.indexOf('a');
        System.out.println(index); //1

//isEmpty()------>checks whether a string is empty or not -------boolean
        String emp = "Paul";
        System.out.println(emp.isEmpty()); //false

//lastIndexOf()------>returns the position of the last founds occurrence of specified characters in a string
        int last = name5.lastIndexOf('a'); //checks banana 012345
        System.out.println(last); //5

//length()--------> returns the size of a string--int
        String str100 = "stststststtstsnkj";
        int length = str100.length();
        System.out.println(length); //17

//replace()--------> searches a string for a specified value, and returns a new string where the specified values are replaced
        ////String
        String name12 = "GulaG";
        String name11 = name12.replace("laG" ,"n");
        String name10 = name12.replace('G','T');
        System.out.println(name11); //Gun
        System.out.println(name10); // TulaT

//replaceFirst()-----> replace first occurence of substring that matches the giveb regular expression with given replacement
         //////String
        System.out.println(name12.replaceFirst("l","T")); //GutaG

//StartsWith()------->Checks whther a strinf starts with specified charactes-----(boolean)

    String name16 = "Alican";
    boolean YN5 = name16.startsWith("A");
        System.out.println(YN5); //true










    }
}
