package leetcodeproblems.easy.array;

import java.util.LinkedHashSet;

public class ThirdMaximumNumber {

    public static void main(String[] args) {

    }


    public int thirdMax(int[] nums) {
//        LinkedHashset<Integer> integerHashset = new LinkedHashSet<>();
        LinkedHashSet<Integer> integerHashset = new LinkedHashSet<>();

        for (int num : nums) {
            integerHashset.add(num);
        }

        if (integerHashset.size() < 3) {
            return integerHashset.getLast();
        } else {
            integerHashset.removeFirst();
            integerHashset.removeFirst();
            return integerHashset.getFirst();
        }
    }
}
