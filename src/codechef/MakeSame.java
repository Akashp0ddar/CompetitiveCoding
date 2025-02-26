package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class MakeSame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            sc.nextLine();
            String x = sc.nextLine();
            String z = sc.nextLine();
            String y = sc.nextLine();
            System.out.println(solve(x, z, y));
        }
    }

    private static int solve(String x, String z, String y) {
        int result = 0;
        char[] arrX = x.toCharArray();
        char[] arrY = y.toCharArray();
        Arrays.sort(arrX);
        Arrays.sort(arrY);

        for (int i = 0; i < arrX.length; i++) {
            if (arrX[i] != arrY[i]) {
                result++;
//                char temp = arrX[i];
//                arrX[i] = arrY[i];
//                arrY[i] = temp;
            }
        }


        if (result != 0)
            return result;

        return -1;
    }

}
