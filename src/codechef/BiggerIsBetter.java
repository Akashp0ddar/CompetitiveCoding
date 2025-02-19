package codechef;

import java.util.Scanner;

public class BiggerIsBetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int length = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            System.out.println(solve(name));
        }
    }


    public static String solve(String name) {
        StringBuilder sb = new StringBuilder();

        for (char s : name.toCharArray()) {
            sb.append("z");
        }


        if (sb.toString().equals(name))
            return "-1";
        else
            return sb.toString();


    }
}
