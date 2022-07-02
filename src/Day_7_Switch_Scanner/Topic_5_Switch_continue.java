package Day_7_Switch_Scanner;

public class Topic_5_Switch_continue {
    public static void main(String[] args) {

        String two = "th" ;
        String day = "";


        switch (two){
            case "mo":
                day = "Monday";
                break;
            case "tu":
                day = "Tuesday";
                break;
            case "we":
                day = "Wednesday";
                break;
            case "th":
                day = "Thursday";
                break;
            case "fr":
                day = "Friday";
                break;
            case "sa":
                day = "Saturday";
                break;
            case "su":
                day = "Sunday";
                break;
            default:
                day = "Invalid";
        }
        System.out.println("The day is: " + day);
    }
}
