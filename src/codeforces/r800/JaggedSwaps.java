package codeforces.r800;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class JaggedSwaps {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            sc.nextLine();
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(jaggedSwaps(arr));
        }

    }


    public static String jaggedSwaps(int[] arr) {
        if (arr[0] == 1) {
            HashSet<Integer> integerHashSet = HashSet.newHashSet(arr.length);
            for (int i = 0; i < arr.length - 1; i++) {
                if (integerHashSet.contains(arr[i])) {
                    return "NO";
                } else if (arr[i] > arr.length) {
                    return "No";
                } else {
                    integerHashSet.add(arr[i]);
                }
            }
        } else {
            return "NO";
        }
        return "YES";
    }

}
