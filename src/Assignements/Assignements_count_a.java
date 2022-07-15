package Assignements;

public class Assignements_count_a {
    ////Write   a   program   that   will   count   how   many   times   "a"   is   found   in   any   given   String:
    ////String mystring="java is fun, but sometimes java is just pain.Love java java java";

    public static void main(String[] args) {
        String MyString="java is fun, but sometimes java is just pain.Love java java java";
        int count=0;

        for (int i = 0; i <= MyString.length()-1; i++) {
            if(MyString.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("The number of letter 'a' in the string= " + count);
    }
}
