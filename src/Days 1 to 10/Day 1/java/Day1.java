import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();

        System.out.print("\nEnter the number of elements the array will have: ");
        int count = scanner.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print("\nEnter integer " + i + ": ");
            int num = scanner.nextInt();
            nums.add(num);
        }

        List<Integer> ans = new ArrayList<>(nums);
        ans.addAll(nums);
        System.out.println(ans);
    }
}