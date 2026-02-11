import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Exercise 1
        System.out.println("Exercise 1: BigO notation\n");

        int[] numbers1 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int[] numbers2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        Exercise1.startExamples(numbers1, numbers2);


        //Exercise 2
/*
        System.out.println("\nExercise 2: Experimental analysis\n");
        System.out.printf("%-15s %-15s%s", "Array size", "Average 1", "Average 2\n");

        int size = 9000;
        int count = 1;
        for (int i = 1000; i <= size; i+=1000){
            System.out.print(count + ". ");
            PrefixAverage.startBothMethods(i);
            count+=1;
        }
*/


        //Exercise 3
        System.out.println("\nExercise 3: Experimental analysis\n");

        ArrayList<Integer> numberList = new ArrayList<>();

        long startTime;
        long endTime;
        long unique1ElapsedTIme;
        long unique2ElapsedTime;
        boolean isUnique;
        long minute = 60000;

        for (int i = 0; i < 1000000; i++) {
            numberList.add(i+1);
        }

        int[] numbers = new int[numberList.size()];

        for (int i = 0; i < numberList.size(); i++) {
            numbers[i] = numberList.get(i);
        }

        /*
        while (minute != 60000) {
            int start;
            int end;
            int middle;

            startTime = System.currentTimeMillis();
            isUnique = Uniqueness.unique1(numbers);
            endTime = System.currentTimeMillis();
            minute = endTime - startTime;

        }
         */

        startTime = System.currentTimeMillis();
        isUnique = Uniqueness.unique1(numbers);
        endTime = System.currentTimeMillis();
        unique1ElapsedTIme = endTime - startTime;


        startTime = System.currentTimeMillis();
        isUnique = Uniqueness.unique2(numbers);
        endTime = System.currentTimeMillis();
        unique2ElapsedTime = endTime - startTime;

        System.out.println("unique1 elapsed time: " + unique1ElapsedTIme +
                "\nunique1 elapsed time: " + unique2ElapsedTime);
    }
}