package codeforces.r800;

import java.util.Arrays;
import java.util.Scanner;

public class Desorting {

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
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return 0;
            }
        }

        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            minDifference = Math.min(arr[i + 1] - arr[i], minDifference);

        }


        return (minDifference + 2) / 2;
    }

}
