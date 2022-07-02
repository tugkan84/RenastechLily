package Day_7_Switch_Scanner;

public class Topic_4_SwitchStatements {
    //it works as similar as if statements
    // it is not common as it
    // if we have a lot of condition check, it is useful tool.
/*
variable name
switch(name){

case ziya :
sout.....
        break;
case seray:
        break;
case tugy :
        break;
case birko:
       break;
default Tugcu: ---> like Else

* */
    public static void main(String[] args) {
        //write a program, every number reflect one month

        int number = 6;
        String Month = "";

        switch (number) { //  where i put my variable
            case 1:
                Month = "jan";
                break;
            case 2:
                Month = "Feb";
                break;
            case 3:
                Month = "Mar";
                break;
            case 4:
                Month = "April";
                break;
            case 5:
                Month = "May";
                break;
            case 6:
                Month = "June";
                break;
            case 7:
                Month = "July";
                break;
            case 8:
                Month = "August";
                break;
            case 9:
                Month = "September";
                break;
            case 10:
                Month = "Oct";
                break;
            case 11:
                Month = "Nov";
                break;
            case 12:
                Month = "Dec";
                break;
            default:
                Month = "Invalid";
                //break; //it is optional
        }
        System.out.println("The month is: " + Month);

    }
}
