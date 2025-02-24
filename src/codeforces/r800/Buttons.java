package codeforces.r800;

import java.util.Scanner;

public class Buttons {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            System.out.println(solve(a, b, c));
        }
    }


    public static String solve(int a, int b, int c) {
        int anna = a;
        int katie = b;

        int upperBound = (c + 1) / 2;
        anna += upperBound;
        katie += c - upperBound;

        return (anna > katie) ? "First" : "Second";

    }

}
