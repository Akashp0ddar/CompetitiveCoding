package leetcodeproblems.easy.array;

import java.util.Arrays;

public class FindFirstAndLastPosition {

    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/solutions/5781959/100-beats-binary-search-java-explained/?envType=problem-list-v2&envId=array

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
