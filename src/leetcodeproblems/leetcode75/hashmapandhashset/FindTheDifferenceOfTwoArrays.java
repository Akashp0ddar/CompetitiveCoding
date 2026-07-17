package leetcodeproblems.leetcode75.hashmapandhashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindTheDifferenceOfTwoArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        System.out.println(findDifference(nums1, nums2));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<Integer> integerHashSet1 = new HashSet<>();
        HashSet<Integer> integerHashSet2 = new HashSet<>();

        for (int i : nums1) integerHashSet1.add(i);
        for (int i : nums2) integerHashSet2.add(i);

        for (int j : nums2) {
            integerHashSet1.remove(j);
        }

        for (int j : nums1) {
            integerHashSet2.remove(j);
        }


        List<Integer> list = new ArrayList<>(integerHashSet1);
        List<Integer> list2 = new ArrayList<>(integerHashSet2);
        ans.add(list);
        ans.add(list2);


        return ans;
    }

}
