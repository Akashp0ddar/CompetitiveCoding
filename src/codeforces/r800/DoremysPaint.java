package codeforces.r800;

import java.util.*;

public class DoremysPaint {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            sc.nextLine();
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(tukka(arr));
        }
    }


    public static String tukka(int[] arr) {
        Map<Integer, Integer> mmap = HashMap.newHashMap(arr.length);


        for (int ar : arr) {
            mmap.put(ar, mmap.getOrDefault(ar, 0) + 1);
        }


        if (mmap.size() > 2) {
            return "NO";
        }

        var valuesSet = new HashSet<>(mmap.values());
        if (arr.length % 2 == 0) {
            if (valuesSet.size() == 1) {
                return "YES";
            } else {
                return "NO";
            }

        } else {

            if (arr.length == 3) {

                if (valuesSet.contains(1)) {
                    return "YES";
                } else {
                    return "NO";
                }

            } else {
                if (mmap.size() > 1) {
                    return "NO";

                } else {
                    return "YES";

                }
            }

        }
    }

}
