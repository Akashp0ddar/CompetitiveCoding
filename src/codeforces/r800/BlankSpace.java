package codeforces.r800;

import java.util.Arrays;
import java.util.Scanner;

public class BlankSpace {


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
        int maxZeros = 0;
        int current = 0;

        for (int ar : arr) {
            if (ar == 0) {
                current++;
            } else {
                if (current > maxZeros)
                    maxZeros = current;
                current = 0;
            }


        }


        if (current > maxZeros) {
            maxZeros = current;
        }


        return maxZeros;
    }

}
