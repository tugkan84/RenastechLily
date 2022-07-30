package Day_17_Arrays.Con2;

import java.util.Arrays;

public class Topic_4_Array_char_method {
    public static void main(String[] args) {
        //String name = "ZiyaYilmaz";
        //name.toCharArray()

        String name1 = "KubraGulay";
        char[] charrr = name1.toCharArray();
        System.out.println(Arrays.toString(charrr)); //[K, u, b, r, a, G, u, l, a, y]

        String name2 = "Bahar Rachael";
        char[] char2 = name2.toCharArray();
        System.out.println(Arrays.toString(char2)); //[B, a, h, a, r,  , R, a, c, h, a, e, l]
    }
}
