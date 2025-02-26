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
        int result;
        int minDifferenceIndex = 0;
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length - 1; i++) {
            int currentDifference = arr[i + 1] - arr[i];
            if (currentDifference < minDifference) {
                minDifferenceIndex = i;
                minDifference = currentDifference;
            }
        }

        int lowerItem = arr[minDifferenceIndex];
        int higherItem = arr[minDifferenceIndex + 1];
        int items = higherItem - lowerItem;
        result = (items + 1) / 2;

        return result;
    }

}
