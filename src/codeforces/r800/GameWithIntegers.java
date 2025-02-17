package codeforces.r800;

import java.util.Scanner;

public class GameWithIntegers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int s = Integer.parseInt(sc.nextLine());
            System.out.println(solve(s));
        }

    }


    public static String solve(int n) {
        if (n % 3 == 0) {
            return "Second";
        } else {
            return "First";
        }
    }

}
