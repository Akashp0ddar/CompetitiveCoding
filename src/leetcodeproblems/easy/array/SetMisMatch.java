package leetcodeproblems.easy.array;

import java.util.Arrays;
import java.util.HashSet;

public class SetMisMatch {


    public static void main(String[] args) {
        System.out.println(Arrays.toString(findErrorNums(new int[]{1, 2, 2, 4})));
    }


    public static int[] findErrorNums(int[] nums) {
        int[] result = new int[2];

        HashSet<Integer> integerHashSet = HashSet.newHashSet(nums.length);

        for (int num : nums) {
            if (integerHashSet.contains(num)) {
                result[0] = num;
                result[1] = num + 1;
            } else {
                integerHashSet.add(num);
            }
        }

        return result;
    }
}
