package codeforces.r800;

import java.util.Arrays;
import java.util.Scanner;

public class DoNotTryToCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int[] inputs = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            String x = sc.nextLine();
            String s = sc.nextLine();
            System.out.println(solve(x, s));
        }
    }


    public static int solve(String x, String s) {
        int counter = 0;
        StringBuilder sb = new StringBuilder(x);

        if (x.contains(s)) {
            return counter;
        } else {
            for (int i = 0; sb.length() < s.length() * 2 || i < 2; i++) {
                counter++;
                sb.append(sb);

                if (sb.toString().contains(s)) {
                    return counter;
                }
            }

        }

        return -1;
    }


}
