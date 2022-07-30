package Day_17_Arrays.Con2;

import java.util.Arrays;

public class Topic_3_Array_StringMethods {
    public static void main(String[] args) {
        String s = "Ziya is instructor";
        String[] ne = s.split(" ");
        System.out.println(Arrays.toString(ne)); //[Ziya, is, instructor]

        String[] ne2 = s.split("");
        System.out.println(Arrays.toString(ne2)); // [Z, i, y, a,  , i, s,  , i, n, s, t, r, u, c, t, o, r]

        String ja = "Java is cool";
        String[] name2 = ja.split("");
        System.out.println(Arrays.toString(name2));


    }
}
