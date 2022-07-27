package Assignements;

public class Assignement_array_display {
    public static void main(String[] args) {
        //Write   a   statement   that   declares   a   string   array   initialized   with   the   following   strings:
        //"Sunday",   "Monday",   "Tuesday",   "Wednesday",   "Thursday",   "Friday"   and   "Saturday".
        //Write   a   loop   that   displays   the   contents   of   each   element   in   the   array   that   you   declared.
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String dayNames = "";

        for (int i = 0; i < days.length; i++) {
            dayNames += days[i] + " ";
        }
        System.out.println(dayNames);
    }
}
