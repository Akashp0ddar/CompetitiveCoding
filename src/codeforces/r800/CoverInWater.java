package codeforces.r800;

import java.util.Scanner;

public class CoverInWater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            sc.nextLine();
            String s = sc.nextLine();
            System.out.println(solve(s));
        }
    }

    public static int solve(String s) {
        int counter = 0;

        if (s.length() < 3) {
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '.') {
                    counter++;
                }
            }

            return counter;
        }

        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == '.' && s.charAt(i + 1) == '.' && s.charAt(i + 2) == '.') {
                return 2;
            } else if (s.charAt(i) != '#') {
                counter++;
            }
        }

        if (s.charAt(s.length() - 1) == '.') {
            counter++;
        }

        if (s.charAt(s.length() - 2) == '.') {
            counter++;
        }


        return counter;
    }


}
