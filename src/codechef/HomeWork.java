package codechef;

import java.util.Scanner;

public class HomeWork {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println((x + (y * 10) >= 100 ? "Yes" : "No"));
    }

}
