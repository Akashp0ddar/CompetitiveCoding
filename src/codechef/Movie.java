package codechef;

import java.util.Scanner;

public class Movie {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int result = 0;

            if (m < n) {
                result += c * m;
                int leftTickets = Math.abs(n - m);
                result += leftTickets * a;
            } else if (m > n) {
                result += c * n;
                int leftPopCorns = Math.abs(n - m);
                result += leftPopCorns * b;
            } else {
                result += n * c;
            }


            System.out.println(result);

        }
    }

}
