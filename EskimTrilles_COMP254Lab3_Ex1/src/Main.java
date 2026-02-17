import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Exercise1.multiplication(6, 5));

//        System.out.println(Exercise2.isPalindrome("racecar"));


        boolean fileFound = false;

            File path = new File("C:\\Users\\EsKim\\Documents");
            String filename = "FindThisFile.txt";

            fileFound = Exercise3.find(path, filename);
            if (fileFound) {
                System.out.println("Search successful");
            }

    }
}