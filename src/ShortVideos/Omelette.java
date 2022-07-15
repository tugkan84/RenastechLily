package ShortVideos;

public class Omelette {

    public static void TurnStove() {
        System.out.println("Stove is on");
    }

    public static void Pan() {
        System.out.println("Pan is on the stove");
    }

    public String Oil(double oil) {
        return oil + " ml added to pan.";
    }

    public void WaitTime(float time) {
        for (int i = 0; i < time; i++) {
            System.out.println("Time: " + time);
        }
    }

    public String AddEggs(int egg) {
        return egg + " eggs added.";
    }

    public String AddSaltPepper(int salt, int pepper) {

        return salt + " gr of the salt and " + pepper + " gr of the pepper were added";

    }

    public static void main(String[] args) {
        TurnStove();
        Pan();
        Omelette one = new Omelette();
        String add1 = one.Oil(3.5);
        System.out.println(add1); //3.5 ml added to pan.

        one.WaitTime(1);//1 minute passed -         Time: 1.0
        String eggs = one.AddEggs(2);
        System.out.println(eggs);//2 eggs added.

        String salt = one.AddSaltPepper(2,2);
        System.out.println(salt);//2 gr of the salt and 2 gr of the pepper were added

        one.WaitTime(5);
        System.out.println("The omelette is ready!" );

    }

}
