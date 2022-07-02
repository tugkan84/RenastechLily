package Assignements;

import java.util.Scanner;

public class Assignement_Multiple_if {
    ////Coding Alexa for Weather [multiple Conditions]
    //
    //New graduate Renastech students want to improve Alexa, and they will add weather functionality;
    //Please help students with the assignment below.
    //-Ask the user what's temperature is Fahrenheit;
    //
    //-Convert the value to Celsius formula :  C = F-32 / 1.80
    //
    //if temperature is  -10 or below  ==> print it's too cold
    //if temperature is between -10 and 0 ==> print  it's cold
    //if temperature is between 0 and 15 ==> print it's not cold
    //if temperature is between 15 and 40 ==>print it's warm
    //if temperature is 40 and 60 ===> print it's extremely hot!!
    //if temperature is above 60 ==> print hot as hell
    //
    //Data to test: -40 F , 5F , 50f, 82, 130F, 400F
     //             -40     -15   10   27   54   200
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What's temperature is Fahrenheit: F ");
        double fahrTemp = scanner.nextDouble();
        fahrTemp = (fahrTemp-32)/1.80;

        if (fahrTemp <= -10){
            System.out.println("It's too cold");
        }else if (fahrTemp < 0 && fahrTemp >-10){
            System.out.println("It's cold");
        }else if(fahrTemp>=0 && fahrTemp<=15){
            System.out.println("It's not cold");
        }else if(fahrTemp>15 &&fahrTemp<=40){
            System.out.println("It's warm");
        }else if(fahrTemp>40 && fahrTemp <= 60){
            System.out.println("It's extremely hot");
        }else if(fahrTemp>60){
            System.out.println("HOT AS HELL");
        }else{
            System.out.println("invalid temperature");
        }
    }
}
