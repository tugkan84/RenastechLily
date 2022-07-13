package Day_10_String_Methods;

public class Topic_1_Strings_Methods {
    public static void main(String[] args) {

//substring()----->Extract the characters from a string,
        //  beginning at a specified start position and through the specified number of character

        String str1 = "LokmanEkin";
        String substr1 = str1.substring(6);
        System.out.println(substr1);// Ekin

        String substr2 = str1.substring(0); //beginning include---->ending excluded
        System.out.println(substr2); //LokmanEkin --fullname
        String substr4 = str1.substring(3,str1.length()); //manEkin
        //String substr4 = str1.substring(3,str1.length()+1); //error
        System.out.println(substr4);

//toLowerCase()----> converts a string to lower case letters----string
        String str2 = "YaSEEN";
        String lowStr2 = str2.toLowerCase();
        System.out.println(lowStr2); //yaseen

//toUpperCase()--->converts a string to Upper case letters----String
        String upStr2 = lowStr2.toUpperCase();
        System.out.println(upStr2);//YASEEN

//trim()------->Removes whitespaces from both end of a string------String
        String str3 = " Cev det ";
        String trmStr3 = str3.trim();
        System.out.println(trmStr3); //Cevdet


    }
}
