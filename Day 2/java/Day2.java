import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        int count;

        while (true) {
            System.out.println("Enter number of elements the array will have. It must be at least 4, and an even number.");
            count = scanner.nextInt();
            if (count >= 4 && count % 2 == 0)
                break;
            else
                System.out.println("Invalid.");
        }

        for (int i = 1; i <= count; i++) {
            System.out.print("\nEnter integer " + i + ": ");
            int num = scanner.nextInt();
            nums.add(num);
        }

        System.out.println(shuffleList(nums));
    }

    public static List<Integer> shuffleList(List<Integer> theList) {
        int n = Math.floorDiv(theList.size(), 2);
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            ans.add(theList.get(i));
            ans.add(theList.get(i + n));
        }
        return ans;
    }
}