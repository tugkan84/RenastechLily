package Day_6_ifElseConditions;

public class Topic1_ifElse_example2 {
    public static void main(String[] args) {

        // if water temp is 100: boiling
        // if water temp is 0 : freezing
        //if water temp is 0<temp<10 : so cold
        //if water temp is between 10 and 30: cold
        //if water temp is 60-90 :hot
        //if water temp 90<temp<100 : so hot
        //the rest is : room temp

        String waterCondition;
        int temp = 60;

        if (temp == 100) {
            waterCondition = "Boiling";
            //System.out.println("The water condition is : " + waterCondition);
        } else if (temp == 0) {
            waterCondition = "freezing";
            // System.out.println("The water condition is : " + waterCondition);
        } else if (0 < temp && temp < 10) {
            waterCondition = "so cold";
            //System.out.println("The water condition is : " + waterCondition);
        } else if (temp >= 10 && temp < 30) {
            waterCondition = "Cold";
            //System.out.println("The water condition is : " + waterCondition);
        } else if (temp >= 60 && temp < 90) {
            waterCondition = "Hot";
            //System.out.println("The water condition is : " + waterCondition);
        } else if (temp >= 90 && temp < 100) {
            waterCondition = "So Hot";
            // System.out.println("The water condition is : " + waterCondition);
        } else {
            waterCondition = "Room Temp";
            //System.out.println("The water condition is: " + waterCondition);
        }
        System.out.println("The water condition is: " + waterCondition);


    }


}

