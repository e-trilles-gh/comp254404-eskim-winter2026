//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] numbers = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int[] numbers2 = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

        int example1 = Exercise1.example1(numbers);
        System.out.println("example 1: " + example1);

        int example2 = Exercise1.example2(numbers);
        System.out.println("example 2: " + example2);

        int example3 = Exercise1.example3(numbers);
        System.out.println("example 3: " + example3);

        int example4 = Exercise1.example4(numbers);
        System.out.println("example 4: " + example4);

        int example5 = Exercise1.example5(numbers, numbers2);
        System.out.println("example 5: " + example5);

    }
}