package codeforces.r800;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayColoring {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            sc.nextLine();
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(solve(arr));
        }
    }


    public static String solve(int[] arr) {
        int result = 0;

        for (int ar : arr) {
            result += ar;
        }

        return (result % 2 == 0) ? "Yes" : "No";
    }

}
