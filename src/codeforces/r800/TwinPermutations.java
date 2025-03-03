package codeforces.r800;

import java.util.Arrays;
import java.util.Scanner;

public class TwinPermutations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            sc.nextLine();
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            solve(arr);
        }
    }


    public static void solve(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int j : arr) {
            stringBuilder.append((arr.length + 1) - j).append(" ");
        }

        System.out.println(stringBuilder);
    }

}
