public class Exercise1 {
    public static int multiplication(int m, int n){

        if (n == 0) {
            return 0;
        } else {
            //recursion will happen until n is 0
            return m + multiplication(m, n - 1);
        }
    }
}
