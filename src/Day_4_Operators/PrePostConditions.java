package Day_4_Operators;

public class PrePostConditions {
    public static void main(String[] args) {

    // after ++
        int num = 10;
        System.out.println("num++ = " + num++); //10
        System.out.println(num);//11
        num++;
        System.out.println(num);//12

    //before ++
        int num1 = 10;
        System.out.println(++num1); //11
        System.out.println(num1); //11

    //after --
        int num2 = 20;
        System.out.println(num2--);//20
        System.out.println(num2); //19

    // before --

        int num3 = 15;
        System.out.println(--num3); //14
    }
}
