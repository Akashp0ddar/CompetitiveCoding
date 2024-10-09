package leetcodeproblems.easy.array;

public class MaxConsecutiveOnes {

    public static void main(String[] args) {


        int[] arr = {1, 0, 1, 1, 0, 1};
        int[] ar2 = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(ar2));

    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxOnes = 0;
        int result = 0;

        for (int i : nums) {
            if (i == 1) {
                maxOnes++;
            } else {

                maxOnes = 0;
            }

            if (maxOnes > result) {
                result = maxOnes;
            }
        }


        return result;
    }
}
