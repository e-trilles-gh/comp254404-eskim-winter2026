import java.awt.*;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        //--------------- Exercise 1 -------------------

        System.out.println("Exercise 1 - Multiplication of two positive integers using recursion.\n");
        System.out.println("6 x 5 = " + Exercise1.multiplication(6, 5));



        //--------------- Exercise 2 -------------------

        System.out.println("\nExercise 2 - Check the string if it is a Palindrome\n");

        //sample strings for testing
//        Exercise2.checkWord("racecar");
//        Exercise2.checkWord("madam");
//        Exercise2.checkWord("gohangasalamiimalasagnahog");
//        Exercise2.checkWord("palindrome");


        //Console app that accepts string from user,
        //and verifies the string if it is a palindrome
        Exercise2.promptUser();



        //--------------- Exercise 3 -------------------

        System.out.println("\n\nExercise 3 - Searching a file from a file system.\n");

        boolean fileFound = false;

        File path = new File("C:\\Users\\EsKim\\Documents");
        String filename = "FindThisFile.txt";

        fileFound = Exercise3.find(path, filename);
        if (fileFound) {
            System.out.println("Search successful");
        } else {
            System.out.println("File not found.");
        }
    }
}