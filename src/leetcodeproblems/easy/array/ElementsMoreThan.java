package leetcodeproblems.easy.array;

import java.util.HashMap;

public class ElementsMoreThan {

    public static void main(String[] args) {

        System.out.println(findSpecialInteger(new int[]{1, 1, 1, 1, 1, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 12, 12, 12}));

    }


    public static int findSpecialInteger(int[] arr) {

        final int[] result = {0};
        final int[] counter = {0};


        HashMap<Integer, Integer> hashMap = new HashMap<>();


        for (int n : arr) {
            hashMap.put(n, hashMap.getOrDefault(n, 0) + 1);
        }


        hashMap.forEach((key, value) -> {
            if (value > counter[0]) {
                counter[0] = value;
                result[0] = key;
            }
        });

        return result[0];

    }
}
