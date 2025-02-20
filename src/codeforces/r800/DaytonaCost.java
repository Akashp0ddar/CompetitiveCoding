package codeforces.r800;

import java.util.Arrays;
import java.util.Scanner;

public class DaytonaCost {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int[] inputs = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(solve(inputs[0], inputs[1], arr));
        }
    }


    public static String solve(int n, int k, int[] arr) {
        for (int ar : arr) {
            if (ar == k) {
                return "YES";
            }
        }

        return "NO";
    }

}
