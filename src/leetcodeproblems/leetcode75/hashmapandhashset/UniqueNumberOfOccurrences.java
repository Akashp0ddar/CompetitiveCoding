package leetcodeproblems.leetcode75.hashmapandhashset;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumberOfOccurrences {

    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        System.out.println(uniqueOccurrences(nums1));
    }

    public static boolean uniqueOccurrences(int[] arr) {
        boolean result = true;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        HashSet<Integer> set = new HashSet<>();

        for (int i : map.values()) {
            if (set.contains(i)) {
                result = false;
                break;
            }

            set.add(i);
        }

        return result;
    }
}
