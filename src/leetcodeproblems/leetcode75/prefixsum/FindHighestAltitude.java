package leetcodeproblems.leetcode75.prefixsum;

public class FindHighestAltitude {

    public static void main(String[] args) {
        int[] arr = {-5, 1, 5, 0, -7};
        System.out.println(largestAltitude(arr));
    }


    public static int largestAltitude(int[] gain) {
        int result = Integer.MIN_VALUE;
        int currentResult = 0;

        for (int j : gain) {
            currentResult += j;
            result = Math.max(result, currentResult);
        }


        return Math.max(result, 0);

    }

}
