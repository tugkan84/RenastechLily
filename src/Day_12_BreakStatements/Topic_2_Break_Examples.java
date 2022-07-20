package Day_12_BreakStatements;

public class Topic_2_Break_Examples {
    public static void main(String[] args) {

        String hello = "Hjhkgybhngello";
        String result = "";    //5
        for (int i = 0; i < hello.length(); i++) {
            if (hello.charAt(i) == 'l') {
                break;
            } else {
                result += hello.charAt(i);
            }
        }
        System.out.println(result);// Hjhkgybhnge
        System.out.println("---------------------------------");

        // I want to sum the numbers from 0 to 50
        // if my sum is over 140, i want to stop

        int sum = 0;
        for (int i = 0; i <= 10; i++) {
            sum += i;
            if (sum+i >= 20) {
                break;
            }
        }
        System.out.println("End result: " + sum);


    }
}
