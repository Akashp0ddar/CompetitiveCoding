package codeforces.r800;

import java.util.Scanner;

public class Coins {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();
            System.out.println(solve(n, k));
        }
    }

    private static String solve(long n, long k) {

        if (k == n || n % 2 == 0)
            return "Yes";

        long counter = 0;

        while (counter <= n) {
            System.out.println(counter);
            counter += k;

            if (counter == n || counter + 2 == n) {
                return "Yes";
            }

            if ((counter - n) % 2 == 0)
                return "Yes";

        }
        
        return "No";
    }

}
