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
        int minDifferenceIndex = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] < minDifference) {
                minDifferenceIndex = i;
                minDifference = arr[i + 1] - arr[i];
            }

        }

        int operation = 0;
        int minNumber = arr[minDifferenceIndex];
        int maxNumber = arr[minDifferenceIndex + 1];

        while (minNumber <= maxNumber) {
            operation++;
            minNumber++;
            maxNumber--;
        }

        return operation;
    }


}
