package Day_5_IfStatements;

public class Topic7_IfElseIfElse {

    public static void main(String[] args) {
///*
// if(){
// } else if(){ another condition
// } else if(){ another condition
// }else if(){ another condition
// } else{
// }
// */
        int Gamenumber = 50;

        if (Gamenumber>100){
            System.out.println("Correct");

        }else if (Gamenumber <50){
            System.out.println("correct");
        } else if(Gamenumber == 50){
            System.out.println("your number is " + Gamenumber);
        }
        else{
            System.out.println("Fail");
        }


    }
}
