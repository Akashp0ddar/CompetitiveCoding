package codechef;

import java.util.Scanner;

public class SnakyStrings {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println((s.charAt(0) == 's' || s.charAt(s.length() - 1) == 's') ? "Yes" : "No");
    }
}
