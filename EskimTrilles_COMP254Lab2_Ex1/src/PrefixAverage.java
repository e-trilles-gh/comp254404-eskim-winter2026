import java.util.ArrayList;

public class PrefixAverage {
    //Returns an array a such that, for all j, a[j] equals the average of x[0], ...,x[j].
    public static double[] prefixAverage1(double[] x) {
        int n = x.length;
        double[] a = new double[n];      //filled with zeros by default
        for (int j = 0; j < n; j++) {
            double total = 0;           //begin computing x[0] + ... + x j[]
            for (int i = 0; i <= j; i++)
                total += x[i];
            a[j] = total / (j+1);       //record the average
        }
        return x;
    }

    //Returns an array a such that, for all j, a[j] equals the average of x[0], ..., x[j].
    public static double[] prefixAverage2(double[] x) {
        int n = x.length;
        double[] a = new double[n];      //filled with zeros by default
        double total = 0;               //compute prefix sum as x[0] + x[1] + ...
        for (int j = 0; j < n; j++) {
            total += x[j];              //update prefix sum to include x[j]
            a[j] = total / (j + 1);      //compute average based on current sum
        }
        return a;
    }

    public static void startBothMethods(int repeat) {

        ArrayList<Double> doubleList = new ArrayList<>();
        double num = 0.0;
        long startTime;
        long endTime;
        long prefix1ElapsedTime;
        long prefix2ElapsedTime;

        //this will create a list that contains double items
        //that will be used by the methods
        for (int i = 0; i < repeat; i++){
            num += i + 0.0;
            for (int j = 0; j < 10; j++) {
                num += 0.1;
                doubleList.add(num);
            }
        }

        double[] doubleNumbers = new double[doubleList.size()];

        for (int i = 0; i < doubleList.size(); i++) {
            doubleNumbers[i] = doubleList.get(i);
        }


        //records the time before running the method
        startTime = System.currentTimeMillis();
        double[] average1 = prefixAverage1(doubleNumbers);

        //records the time after running the method
        endTime = System.currentTimeMillis();

        //calculates the difference between the start and
        //end time to get the time the method took
        //while running
        prefix1ElapsedTime = endTime - startTime;


        startTime = System.currentTimeMillis();
        double[] average2 = prefixAverage2(doubleNumbers);
        endTime = System.currentTimeMillis();
        prefix2ElapsedTime = endTime - startTime;

        //this will show the results of both methods
        //in a table format
        System.out.printf("%-15s %-15s%s", repeat, prefix1ElapsedTime, prefix2ElapsedTime + "\n");
    }
}
