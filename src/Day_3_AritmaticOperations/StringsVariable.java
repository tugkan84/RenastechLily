package Day_3_AritmaticOperations;

public class StringsVariable {
    public static void main(String[] args) {


        //it is not PRIMITIVE TYPE

        String name = "123456"; //this is a text
        String name2 = "Seray"; // this is also text

        String name3 = name + name2;
        System.out.println(name3); //123456Seray
        String name4 = name + " " + name2;
        System.out.println(name4);//123456 Seray

        String name5 = name + " like to teach " + name2;
        System.out.println(name5);

        char ch = 'R';
        String st = "Toys"+ "-"+ch+ " "+"Us";
        System.out.println(st); //Toys-R Us

        int numnum = 34;
        String name20= "This is us";
        String name30 = name20 + numnum;
        System.out.println(name30); //This is us34

    }

        }
