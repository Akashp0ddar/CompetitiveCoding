package codeforces.r800;

import java.util.Arrays;
import java.util.Scanner;

public class WeNeedZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            sc.nextLine();
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(solve(arr));
        }
    }

    private static int solve(int[] arr) {

        for (int i = 0; i < 256; i++) {
            int[] temp = Arrays.copyOf(arr, arr.length);
            for (int j = 0; j < arr.length; j++) {
                temp[j] ^= i;
            }
            int counter = 0;
            for (int k : temp) {
                counter ^= k;
            }

            if (counter == 0) {
                return i;
            }
        }

        return -1;
    }

}
