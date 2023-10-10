import java.util.ArrayList;
import java.util.List;

public class Solutions {


    /**
     * <a href="https://www.hackerrank.com/challenges/solve-me-first/problem">...</a>
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * <a href="https://www.hackerrank.com/challenges/simple-array-sum/problem">...</a>
     */
    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        // Write your code here
        for (int i : ar) {
            sum += i;
        }
        return sum;
    }

    // 30 Day Logic building

    /**
     * <a href="https://www.hackerrank.com/challenges/compare-the-triplets/problem">...</a>
     */
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> score = new ArrayList<>(2);
        int aliceScore = 0;
        int bobScore = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < b.get(i)) {
                bobScore++;
            } else if (a.get(i) > b.get(i)) {
                aliceScore++;
            }
        }
        score.add(aliceScore);
        score.add(bobScore);
        return score;
    }

    /**
     * <a href="https://www.hackerrank.com/challenges/a-very-big-sum/problem">...</a>
     */
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        Long i = 0L;
        for (Long g : ar) {
            i += g;
        }
        return i;
    }

    /**
     * <a href="https://www.hackerrank.com/challenges/mini-max-sum/problem">...</a>
     */
    public static void miniMaxSum(List<Integer> arr) {
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        Long sum = 0L;
        for (int i = 0; i < arr.size(); i++) {
            Integer num = arr.get(i);
            sum += num;
            if (max < num)
                max = num;
            if (min > num)
                min = num;
        }
        System.out.println((sum - max) + " " + (sum - min));

    }

    /**
     * <a href="https://www.hackerrank.com/challenges/plus-minus/problem">
     * </a>
     */
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float positiveValue = 0f;
        float negativeValue = 0f;
        float zero = 0f;
        for (Integer integer : arr) {
            if (integer > 0) {
                positiveValue++;
            } else if (integer < 0) {
                negativeValue++;
            } else {
                zero++;
            }
        }

        String positiveOutput = String.format("%.6f", positiveValue / arr.size());
        String negativeOutput = String.format("%.6f", negativeValue / arr.size());
        String zeroOutput = String.format("%.6f", zero / arr.size());
        System.out.println(positiveOutput + "\n" + negativeOutput + "\n" + zeroOutput);

    }

    /**
     * <a href="https://leetcode.com/problems/remove-element/">...</a>
     */
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    /**
     * <a href="https://leetcode.com/problems/search-insert-position/">...</a>
     */
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }
}
