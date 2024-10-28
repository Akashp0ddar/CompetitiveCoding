package leetcodeproblems.easy.array;

public class LongestContinousSubsequence {

    public static void main(String[] args) {

        System.out.println(findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));

    }


    public static int findLengthOfLCIS(int[] nums) {

        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] < nums[i + 1]) {
                result++;
            }
        }

        return result;

    }

}
