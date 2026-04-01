package codechef;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class CandyTypes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            HashSet<Integer> set = new HashSet<>(arr.length);
            boolean isAlreadyPrint = false;

            for (int i = 0; i < arr.length - 1; i++) {
                if (set.contains(arr[i])) {
                    isAlreadyPrint = true;
                    System.out.println(arr[i]);
                    break;
                } else {
                    set.add(arr[i]);
                }
            }
            if (!isAlreadyPrint) {

                System.out.println(Collections.min(set));
            }
        }
    }
}
