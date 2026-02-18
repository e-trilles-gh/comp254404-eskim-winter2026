import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise2 {

    public static void promptUser() {
        //flag used for the loop
        boolean isChecking = true;

        while (isChecking) {
            String word;

            //prompts the user for a word or exit the program
            System.out.print("Enter a word to check if it is a Palindrome, or type exit to terminate the program: ");

            //stores the string typed by the user.
            //if multiple words are typed, only the word before the
            //first space will be used, and converts the string into lowercase
            word = new Scanner(System.in).next().toUpperCase();

            //checks if the user chose to terminate the program
            if (word.equalsIgnoreCase("exit")){
                System.out.println("Terminating the program . . .");
                isChecking = false;
            } else {
                //calls the isPalindrome method to verify if the
                //word is a palindrome - the word is used as the argument
                Exercise2.checkWord(word);
            }
        }
    }

    public static void checkWord(String word) {
        //stores the number of character of the word
        int charCount = word.length();

        //checks if the word and its reversed spelling are the same
        if (word.equals(reverseWord(word, charCount))) {
            System.out.println("\nThe word " + word + " is a Palindrome.\n");
        } else {
            System.out.println("\nThe word " + word + " is NOT a Palindrome.\n");
        }
    }

    public static String reverseWord(String word, int charIndex) {
        String newWord = "";

        if (charIndex == 0) {
            return "";
        } else {
            //creates a list that will store all the characters of the word
            List<Character> charList = new ArrayList<>();

            //accesses each character of the word and store it in a list
            for (char c : word.toCharArray()){
                charList.add(c);
            }

            //creates the new word starting from the
            // last letter of the word being tested
            newWord += charList.get(charIndex - 1);

            //calls the same method as recursion until the new word is created.
            //every recursion will access every character of the word starting
            //from the last index 1 up to the first character.
            //previous method accessed
            return newWord + reverseWord(word, charIndex - 1);
        }
    }
}
