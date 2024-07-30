public class Day11 {
    public static int minRepeats(String a, String b) {
        int lenA = a.length();
        int lenB = b.length();
        int repeatCount = (lenB + lenA - 1) / lenA;

        StringBuilder repeatedA = new StringBuilder(a.repeat(repeatCount));
        if (repeatedA.indexOf(b) != -1) {
            return repeatCount;
        }

        repeatedA.append(a);
        if (repeatedA.indexOf(b) != -1) {
            return repeatCount + 1;
        }

        return -1;
    }

    public static void main(String[] args) {
        String a = "abcd";
        String b = "cdabcdab";
        System.out.println(minRepeats(a, b));
    }
}