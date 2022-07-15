package Day_11_ForLoops;

public class Topic_3_Reverse_String {
    public static void main(String[] args) {
        String name = "Seray";
        StringBuilder result= new StringBuilder();

        for (int i = name.length()-1; i >= 0; i--) {
            result.append(name.charAt(i));
        }
        System.out.println(result);
    }
}
