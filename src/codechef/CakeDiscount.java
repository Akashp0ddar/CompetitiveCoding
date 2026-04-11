package codechef;

import java.util.Scanner;

public class CakeDiscount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 5) {
            System.out.println(n * 100);
        } else {
            System.out.println(n * 85);
        }
    }

}
