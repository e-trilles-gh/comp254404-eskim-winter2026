import java.util.ArrayList;
import java.util.List;

public class Exercise2 {

    public static boolean isPalindrome(String word) {
        boolean isPalindrome = false;
        int charCount = word.length();
        if (word.equals(reverseWord(word, charCount))) {
            return true;
        }
        return isPalindrome;
    }

    public static String reverseWord(String word, int charCount) {
        String newWord = "";
        if (charCount == 0) {
            return "";
        } else {
            List<Character> charList = new ArrayList<>();
            for (char c : word.toCharArray()){
                charList.add(c);
            }
            newWord += charList.get(charCount - 1);
            return newWord + reverseWord(word, charCount - 1);
        }
    }
}
