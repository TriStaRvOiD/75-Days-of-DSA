import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Day7 {
    public static void main(String[] args) {
        String line = "hello world.   how are  you?";
        String[] wordsArray = line.split("\\s+");
        List<String> wordsList = Arrays.asList(wordsArray);
        Collections.reverse(wordsList);
        String reversedLine = String.join(" ", wordsList);
        System.out.println(reversedLine);
    }
}