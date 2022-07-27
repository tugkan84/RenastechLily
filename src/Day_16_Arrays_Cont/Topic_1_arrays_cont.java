package Day_16_Arrays_Cont;

public class Topic_1_arrays_cont {

    public static void main(String[] args) {
        // find the average age of people in the array
        // sum of all the numbers / number of the ages

        int[] age ={ 24,60,23,19,45,90};
        int sum=0;
        for (int i = 0; i < age.length; i++) {
            sum +=age[i]; //sum= sum+ ages[i] because i want to values

        }
        float average = (float)sum/ age.length;
        System.out.println(average); //43.5




    }
}
