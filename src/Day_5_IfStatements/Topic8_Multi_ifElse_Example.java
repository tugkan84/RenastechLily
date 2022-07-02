package Day_5_IfStatements;

public class Topic8_Multi_ifElse_Example {

    public static void main(String[] args) {
        // 100-90 result A Grade
        // 89-80 result B Grade
        // 79-70 result C Grade
        // 69-60 result D Grade
        // 59-0 result F Grade

        int point = 78;
        if (point >= 90) {
            System.out.println("Grade is A");
        } else if (point >= 80 && point <= 89) {
            System.out.println("Grade is B");
        } else if (point >= 70 && point <= 79) {
            System.out.println("Grade is C");
        } else if (point >= 60 && point <= 69) {
            System.out.println("Grade is D");
        } else if(point>=59 && point<=0){
            System.out.println("Your grade is F");
        } else {
            System.out.println("Invalid Point");
        }
    }
}
