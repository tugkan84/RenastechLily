package Day_2_Variables;

public class Escape_Sequences {
    public static void main(String[] args) {
    //      \t  leave paragraph space
        System.out.print("\tThis is a tab space");
        //	This is a tab space
        System.out.print("\tThis is a tab space \t this is another line");
        //	This is a tab space 	 this is another line


        System.out.print("this is a test \t ");
        System.out.print("\tThis is prag");

    //       \n new line
        System.out.print("\nNew line");

    //   \" double quote
        System.out.print("\nThis is \"Seray\""); // This is "Seray"

    //   \\ prints \
        System.out.print("\nThis is back slash \\"); // This is back slash \

    // \' single quote
        System.out.print("\nThis is \'Seray\'");    // This is 'Seray'

    }
}
