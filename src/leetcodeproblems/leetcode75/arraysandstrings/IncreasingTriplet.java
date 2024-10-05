package leetcodeproblems.leetcode75.arraysandstrings;

public class IncreasingTriplet {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int[] arr2 = {5, 4, 3, 2, 1};
        int[] arr3 = {2, 1, 5, 0, 4, 6};

        System.out.println(increasingTriplet(arr3));

    }

    public static boolean increasingTriplet(int[] nums) {

        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        int min = Integer.MAX_VALUE;
        int minIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                maxIndex = i;
            }

            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }

        if (maxIndex > minIndex) {
            for (int i = minIndex; i < maxIndex; i++) {
                if (nums[i] > min && nums[i] < max) {
                    return true;
                }
            }
        } else {
            for (int i = maxIndex; i >= minIndex; i--) {
                if (nums[i] > min && nums[i] < max) {
                    return true;
                }
            }
        }

        return false;

    }
}
