package codechef;

import java.util.Scanner;

public class AllZero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            while (a != 0 && b != 0 && c != 0) {

                if ((a + b + c & 1) == 1) {
                    a -= 1;
                    b -= 2;


                } else {
                    b -= 1;
                    c -= 3;

                }

                System.out.println(a + " " + b + " " + c);

            }

            if (a + b + c == 0) {
                System.out.println("No");
            } else
                System.out.println("Yes");


        }
    }
}
