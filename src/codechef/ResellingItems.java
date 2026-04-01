package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class ResellingItems {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            sc.nextLine();
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(resellItems(arr, k));
        }
    }

    private static int resellItems(int[] arr, int k) {

        int profit = 0;
        Arrays.sort(arr);

        for (int i = arr.length - 1; i >= k; i--) {
            System.out.println("Current number " + arr[i]);
            System.out.println("Current Profilet " + (arr[i] - 5));
            profit += arr[i] - 5;
        }

//        for (int i = 0; i < arr.length - k; i++) {
////            System.out.println(arr[i]-10);
//            profit+=arr[i]-10;
//        }


        return profit;
    }
}
