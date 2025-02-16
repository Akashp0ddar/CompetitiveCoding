package codechef;

import java.util.HashSet;
import java.util.Scanner;

public class CoolSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        StringBuilder stringBuilder = new StringBuilder();

//        int t = Integer.parseInt(sc.nextLine());
//        while (t-- > 0) {
//            sc.nextLine();
//            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
//            stringBuilder.append(solve(arr)).append("\n");
//        }

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.println(solve(arr));
        }


//        System.out.println(stringBuilder);

    }

    public static String solve(int[] arr) {


        HashSet<Integer> hs = HashSet.newHashSet(arr.length);
        for (int i : arr) {
            if (hs.contains(i))
                return "1\n" + i;

            hs.add(i);
        }
        return "-1";
    }
}
