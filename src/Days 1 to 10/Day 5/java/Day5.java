import java.util.Arrays;
import java.util.List;

class Day5 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 3, 3, 232, 54, 2, 4231, 43, 95);

        int maxCurrent = nums.get(0);
        int maxGlobal = nums.get(0);

        for (int i = 1; i < nums.size(); i++) {
            maxCurrent = Math.max(nums.get(i), maxCurrent + nums.get(i));
            if (maxCurrent > maxGlobal)
                maxGlobal = maxCurrent;
        }

        System.out.println(maxGlobal);
    }
}