package codeforces.r800;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UnitArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            sc.nextLine();
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(solve(arr));
        }
    }


    public static int solve(int[] arr) {
        int result = 0;
        HashMap<Integer, Integer> hashMap = HashMap.newHashMap(2);
        hashMap.put(-1, 0);
        hashMap.put(1, 0);
        for (int ar : arr) {
            hashMap.put(ar, hashMap.getOrDefault(ar, 0) + 1);
        }

        while (getSum(hashMap) < 0 || getMultiply(hashMap) % 2 != 0) {
            result++;
            hashMap.put(-1, hashMap.get(-1) - 1);
            hashMap.put(1, hashMap.get(1) + 1);
        }

        return result;
    }


    static int getSum(HashMap<Integer, Integer> hs) {
        int ret = 0;

        for (Map.Entry<Integer, Integer> a : hs.entrySet()) {
            ret += a.getKey() * a.getValue();
        }
        return ret;
    }


    static int getMultiply(HashMap<Integer, Integer> hs) {

        return hs.get(-1);
    }

}
