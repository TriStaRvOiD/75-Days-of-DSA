import java.util.HashSet;
import java.util.Set;

class Day8 {
    public static void main(String[] args) {
        String theString = "hello Racecar babb as nenonen";
        Set<String> result = findLongestPalindromes(theString);
        System.out.println(result);
    }

    static boolean isPalindrome(String stringValue) {
        String reversedString = new StringBuilder(stringValue).reverse().toString();
        return stringValue.equals(reversedString);
    }

    static Set<String> findLongestPalindromes(String theString) {
        String stringValue = theString.toLowerCase().replace(" ", "");

        Set<String> palindromesSet = new HashSet<>();

        int longestLength = 0;

        for (int i = 0; i < stringValue.length(); i++) {
            for (int j = i + 1; j < stringValue.length() + 1; j++) {
                String substring = stringValue.substring(i, j);
                if (isPalindrome(substring)) {
                    int substringLength = substring.length();
                    if (substringLength > longestLength) {
                        longestLength = substringLength;
                        palindromesSet.clear();
                        palindromesSet.add(substring);
                    }
                    else if (substringLength == longestLength) {
                        palindromesSet.add(substring); 
                    }
                }
            }
        }
        return palindromesSet;
    }
}