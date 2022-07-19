package Day_12_BreakStatements;

public class Topic_4_Continue_Example {
    public static void main(String[] args) {
        //write a code where it checks every character in a string and
        // when is sees a "L" or "A" pass

        String str = "HelloApple";
        String strUp = str.toUpperCase();
        String result = "";

        for (int i = 0; i < strUp.length(); i++) {
            if ((strUp.charAt(i)== 'L') || (strUp.charAt(i) == 'A')){
                continue;
            }
            result +=strUp.charAt(i);
        }
        System.out.print(result);
    }
}
