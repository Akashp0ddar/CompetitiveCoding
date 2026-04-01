package codechef;

import java.util.Arrays;
import java.util.Scanner;

public class ModerateTemperatures {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            int[] temperatures = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(moderateTemperatures(temperatures));
        }
    }

    private static int moderateTemperatures(int[] temperatures) {
        int maxTemp = Integer.MIN_VALUE;
        int minTemp = Integer.MAX_VALUE;

        for (int i : temperatures) {
            maxTemp = Math.max(i, maxTemp);
            minTemp = Math.min(i, minTemp);
        }

        int counter = 0;

        for (int temp : temperatures) {
            if (temp > minTemp && temp < maxTemp) {
                counter++;
            }
        }

        return counter;
    }

}
