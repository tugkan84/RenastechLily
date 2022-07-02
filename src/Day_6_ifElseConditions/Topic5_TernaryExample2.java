package Day_6_ifElseConditions;

public class Topic5_TernaryExample2 {
    public static void main(String[] args) {
        //if point >100 or <0 - our of range
        //90 - 100 grade:A
        //80 - 90 Grade B
        //70 - 80 Grade C
        //60-70 Grade D
        //50-60 Grade F
        //less than 50 Grade failed

        int points = -20;
        String grade;

        grade = (points < 0 || points > 100) ? "Out of Range" : (points >= 90 && points <= 100) ? "Grade A " :
                (points < 90 && points >= 80) ? "Grade B" : (points < 80 && points >= 70) ? "Grade C" :
                        (points < 70 && points >= 60) ? "Grade D" : (points < 60 && points >= 50) ? "Grade F" :
                                "Grade FAILED";
        System.out.println(grade);

    }
}
