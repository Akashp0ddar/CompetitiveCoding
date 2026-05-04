package leetcodeproblems.leetcode75.slidingwindow;

public class LongestSubArrayAfterDeletingOneElement {

    public static void main(String[] args) {
        System.out.println(longestSubarray(new int[]{1, 1, 0, 1}));
    }


    public static int longestSubarray(int[] nums) {
        int result = 0;
        int zero = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zero++;
            }

            while (zero > 1) {
                if (nums[left] == 0) {
                    zero--;
                }
                left++;
            }


            result = Math.max(result, right - left);
        }

        return result;
    }

}
