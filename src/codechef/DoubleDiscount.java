package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class DoubleDiscount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int budget = sc.nextInt();
            sc.nextLine();
            int[] price = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] tastiness = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(doubleDiscount(budget, price, tastiness));
        }
    }

    private static int doubleDiscount(int budget, int[] price, int[] tastiness) {
        return 0;
    }
}
