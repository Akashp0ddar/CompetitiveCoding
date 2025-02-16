package codeforces.r800;

import java.util.Arrays;
import java.util.Scanner;

public class HalloumiBoxes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int[] inputs = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            if (sortArray(arr, inputs[0], inputs[1])) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }


    public static boolean sortArray(int[] arr, int n, int k) {

        if (k == 1) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    return false;
                }
            }
        } else {
            for (int i = 0; i < arr.length - 1; i++) {
                int left = arr[i];
                int right = arr[i + 1];
                if (left > right) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

        }
        return true;
    }

}
