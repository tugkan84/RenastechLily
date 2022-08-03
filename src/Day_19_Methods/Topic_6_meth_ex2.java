package Day_19_Methods;

import java.util.Scanner;

public class Topic_6_meth_ex2 {
    public static void main(String[] args) {
    //write a method that has 3 inputs parameters and finds the max num between 3 numbers
        System.out.println("MaxNumber(3,2,1) = " + MaxNumber(3, 2, 1)); //MaxNumber(3,2,1) = 3
        CallMyFunc();

    }
    public static int MaxNumber(int a, int b, int c){
        int max=0;
        if (a>b && a>c){
            max = a;
        }else if(b>a && b>c){
            max = b;
        }else{
            max = c;
        }
        return max;
    }

    public static void CallMyFunc(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.nextLine();

        System.out.println("the name you have entered is: "+name);
        PrintName1(5);
    }
    public static void PrintName1(int times){
        for (int i = 0; i < times; i++) {
            System.out.println("The name is:Sera");
        }
    }


}
