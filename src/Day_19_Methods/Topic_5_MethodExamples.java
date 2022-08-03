package Day_19_Methods;

public class Topic_5_MethodExamples {
    public static void main(String[] args) {
        ////   public                 static              void               main          (String [] args){
        // // Access-modifier        specifier          return-type         methodName       (paramater)


        MyFirstMethod();                                       //This is my Method
        System.out.println("This is inside of main method");   //This is inside of main method
        MyFirstMethod();                                       //This is my Method
        SumTheNumber(7,10);                              //Sum of 2 numbers is : 17


    }

    public static void MyFirstMethod() {
        System.out.println("This is my Method");

    }
    public static void SumTheNumber(int a, int b){
        int sum = a+b;
        System.out.println("Sum of 2 numbers is : "+sum);
        MyFirstMethod();


    }
}
