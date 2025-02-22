package codeforces.r800;

import java.util.Arrays;
import java.util.Scanner;

public class AmbitiousKid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextLine();
        int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(solve(arr));
    }


    public static int solve(int[] arr) {
        int maxValue = Integer.MAX_VALUE;


        if (arr.length == 1) {
            return Math.abs(arr[0]);
        }

        for (int number : arr) {
            if (Math.abs(number) < Math.abs(maxValue) ||
                    (Math.abs(number) == Math.abs(maxValue) && number > maxValue)) {
                maxValue = Math.abs(number);
            }
        }


        return maxValue;
    }
}
