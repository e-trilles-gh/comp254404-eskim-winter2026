public class Exercise1 {
    //Returns the sum of the integers in given array.
    public static int example1(int[] arr) {
        int n = arr.length, total = 0;
        for (int j = 0; j < n; j++)     //loop from 0 to n-1
            total += arr[j];
        return total;
    }
    /*
    Result is 40
    Exercise1 is O(n) because the amount of work grows at the same rate
    the size of input grows

     */

    //Returns the sum of the integers with even index in given array.
    public static int example2(int[] arr) {
        int n = arr.length, total = 0;
        for (int j = 0; j < n; j += 2)  //note the increment of 2
            total += arr[j];
        return total;
    }
    /*
    Result is 20
    Exercise2 is also O(n) because both the input size and the amount of work
    increase at the same rate. Although +=2 is included which is a constant,
    the growth shows linear pattern.
     */

    //Returns the sum of the prefix sums of given array.
    public static int example3(int[] arr) {
        int n = arr.length, total = 0;
        for (int j = 0; j < n; j++)         //loop from 0 to n-1
            for (int k = 0; k <= j; k++)    //loop from 0 to j
                total += arr[j];
        return total;
    }
    /*
    Result is 820
    Exercise3 is O(n^2) because the it has nested loops which count as O(n*n).
    the growth shows an exponential pattern.
     */

    //Returns the sum of the prefix sums of given array.
    public static int example4(int[] arr) {
        int n = arr.length, prefix = 0, total = 0;
        for (int j = 0; j < n; j++ ) {      //loop from 0 to n-1
            prefix += arr[j];
            total += prefix;
        }
        return total;
    }
    /*
    Result is 820
    Exercise4 is O(n) because it has one loop, although it has a constant
    equation as part of its logic, the count of iteration is still
    growing as O(n)
     */

    //Returns the umber of times second array stores sum of prefix sums from first.
    public static int example5(int[] first, int[] second) { //assume equal-length arrays
        int n = first.length, count = 0;
        for (int i = 0; i < n; i++) {           //loop from 0 to n-1
            int total = 0;
            for (int j = 0; j < n; j++)        //loop from 0 to n-1
                for (int k = 0; k <= j; k++)    //loop from 0 to j
                    total += first[k];
            if (second[i] == total) count++;
        }
        return count;
    }
    /*
    Result is 0
    Exercise5 is O(n^3) because of the number of nested loop which can be
    shown as O(n*n*n). Although the innermost loop does not directly
    use the n, it is indirectly using the n through the loop next to it which
    is using the loop directly.
     */

    public static void startExamples(int[] numbers1, int[] numbers2) {
        int example1 = example1(numbers1);
        System.out.println("example 1: " + example1);

        int example2 = example2(numbers1);
        System.out.println("\nexample 2: " + example2);

        int example3 = example3(numbers1);
        System.out.println("\nexample 3: " + example3);

        int example4 = example4(numbers1);
        System.out.println("\nexample 4: " + example4);

        int example5 = example5(numbers1, numbers2);
        System.out.println("\nexample 5: " + example5);
    }
}
