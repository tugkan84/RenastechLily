package Day_5_IfStatements;

public class Topic2_IfStatement {
    public static void main(String[] args) {

        //if is a condition where it decides , if the code block should run or not
        //if(condition){   }
        //

        String name = "Class, this is the code block";
        int var1 = 10;

        if (var1 == 10){
            System.out.println(name);
        }
        System.out.println("this is outside of if statement");

        if (10>11){
            System.out.println("This is none sense");
        }

        String name1 = "Recep";
        if (name1 == "Recep"){
            System.out.println(name1);
        }

        int a  = 10;
        if (a++ == 11){
            System.out.println("a is eleven");
        }
        if(a==11){
            System.out.println("This is the second line");
        }


    }




}
