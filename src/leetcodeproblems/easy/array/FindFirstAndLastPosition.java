package leetcodeproblems.easy.array;

import java.util.Arrays;

public class FindFirstAndLastPosition {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(searchRange(new int[]{}, 0)));
    }


    public static int[] searchRange(int[] nums, int target) {
        int firstPosition = -1;
        int lastPosition = -1;

        boolean firstPositionFetched = false;

        for (int i = 0; i < nums.length; i++) {

            if (!firstPositionFetched && nums[i] == target) {
                firstPositionFetched = true;
                firstPosition = i;
                lastPosition = i;

            } else if (nums[i] == target) {
                lastPosition = i;

            }

        }

        return new int[]{firstPosition, lastPosition};
    }
}
