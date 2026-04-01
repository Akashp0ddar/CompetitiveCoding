package codechef;

import java.util.Scanner;

public class PopCornBuying {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(popcorn(scanner.nextInt()));
    }


    public static int popcorn(int money) {
        int result;

        if (money < 50) {
            return 0;
        }

        int popcornMoney = money - 100;

        result = popcornMoney / 50;

        return result;
    }

}
