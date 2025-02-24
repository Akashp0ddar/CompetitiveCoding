package codeforces.r800;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SequenceGame {

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
        ArrayList<Integer> sequenceA = new ArrayList<>(arr.length);
        sequenceA.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {

            if (sequenceA.getLast() <= arr[i]) {
                sequenceA.add(arr[i]);
            } else {
                sequenceA.add(arr[i]);
                sequenceA.add(arr[i]);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(sequenceA.size()).append("\n");

        sequenceA.forEach((value) -> stringBuilder.append(value).append(" "));
        System.out.println(stringBuilder);
    }


}
