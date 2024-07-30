import java.util.HashMap;
import java.util.Map;

public class Day10 {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        boolean result = anagramCheck(s, t);
        if (result) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    public static boolean anagramCheck(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        
        Map<Character, Integer> firstDict = new HashMap<>();
        Map<Character, Integer> secondDict = new HashMap<>();

        for (char ch : first.toCharArray()) {
            firstDict.put(ch, firstDict.getOrDefault(ch, 0) + 1);
        }

        for (char ch : second.toCharArray()) {
            secondDict.put(ch, secondDict.getOrDefault(ch, 0) + 1);
        }

        return firstDict.equals(secondDict);
    }
}