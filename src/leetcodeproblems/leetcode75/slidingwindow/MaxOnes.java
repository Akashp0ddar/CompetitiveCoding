package leetcodeproblems.leetcode75.slidingwindow;

public class MaxOnes {


    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        System.out.println(longestOnes(arr, k));
    }


    public static int longestOnes(int[] nums, int k) {

        int result = 0;
        int maxZeros = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                maxZeros++;
            }

            while (maxZeros > k) {
                if (nums[left] == 0) {
                    maxZeros--;
                }
                left++;
            }

            result = Math.max(result, right - left + 1);
        }

        return result;

    }

}
