import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        int count;

        while (true) {
            System.out.println("Enter length of array. It cannot be less than 2.");
            count = scanner.nextInt();
            if (count >= 2)
                break;
            else
                System.out.println("Invalid.");
        }

        for (int i = 1; i <= count; i++) {
            System.out.print("\nEnter integer " + i + ": ");
            int num = scanner.nextInt();
            nums.add(num);
        }

        int goodPairsCount = 0;

        for (int i = 0; i < nums.size(); i++) {
            for (int j = i + 1; j < nums.size(); j++) {
                if (nums.get(i).equals(nums.get(j)))
                    goodPairsCount++;
            }
        }

        System.out.println(goodPairsCount);
    }
}
