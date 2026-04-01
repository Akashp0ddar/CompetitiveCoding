package codechef;

import java.util.Scanner;

public class PassingExams {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            System.out.println(isPassed(x, y, z));
        }
    }

    private static String isPassed(int x, int y, int z) {
        String result = "Yes";
        int counter = 0;


        if (x >= 50) {
            counter++;
        }


        if (y >= 50) {
            counter++;
        }

        if (z >= 50) {
            counter++;
        }


        if (counter < 2) {
            result = "No";
        }


        return result;
    }

}
