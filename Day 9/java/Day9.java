import java.util.List;
import java.util.Arrays;

class Day9 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("flower", "flow", "flight");
        System.out.println(findLongestCommonPrefix(strings));

        strings = Arrays.asList("rad", "racecar", "car");
        System.out.println(findLongestCommonPrefix(strings));
    }

    public static String findLongestCommonPrefix(List<String> listOfStrings) {
        if (listOfStrings.isEmpty()) return "";

        String shortestString = listOfStrings.stream()
                .min((s1, s2) -> Integer.compare(s1.length(), s2.length()))
                .orElse("");

        for (int i = 0; i < shortestString.length(); i++) {
            char ch = shortestString.charAt(i);
            for (String otherString : listOfStrings) {
                if (otherString.charAt(i) != ch) {
                    return shortestString.substring(0, i);
                }
            }
        }
        return shortestString;
    }
}