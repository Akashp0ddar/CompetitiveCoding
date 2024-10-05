package leetcodeproblems.leetcodedaily;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class RankToTransform {

    //https://leetcode.com/problems/rank-transform-of-an-array/?envType=daily-question&envId=2024-10-02

    public static void main(String[] args) {


        int[] arr = {37, 12, 28, 9, 100, 56, 80, 5, 12};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));

    }


    public static int[] arrayRankTransform(int[] arr) {

//        int[] result = new int[arr.length];

//        int[] sortedArr = new int[arr.length];

//        System.arraycopy(arr, 0, sortedArr, 0, arr.length);
//
//        Arrays.sort(sortedArr);
//
//
//
//
//        for (int i = 0; i < sortedArr.length; i++) {
//            hashMap.put(sortedArr[i], i+1);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            result[i] = hashMap.get(arr[i]);
//        }


        HashSet<Integer> hs = HashSet.newHashSet(arr.length);


        for (int i : arr) {
            hs.add(i);
        }


        int[] sorted = new int[hs.size()];

        HashMap<Integer, Integer> hashMap = HashMap.newHashMap(sorted.length);

        int counter = 0;

        for (int j : hs) {
            sorted[counter] = j;
            counter++;
        }


        Arrays.sort(sorted);


        for (int i = 0; i < sorted.length; i++) {
            hashMap.put(sorted[i], i + 1);
        }


        for (int i = 0; i < arr.length; i++) {
            arr[i] = hashMap.get(arr[i]);
        }

        return arr;

    }
}
