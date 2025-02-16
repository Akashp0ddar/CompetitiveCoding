package codeforces.r800;

import java.util.Arrays;
import java.util.Scanner;

public class LineTrip {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            int[] inputs = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] arr = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            System.out.println(fuelCapacity(arr, inputs[1]));
        }


    }

    public static int fuelCapacity(int[] arr, int x) {
        int fuelTankCapacity = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] > fuelTankCapacity) {
                fuelTankCapacity = arr[i + 1] - arr[i];
            }
        }


        int lastCapacity = (x - arr[arr.length - 1]) * 2;

        if (fuelTankCapacity < lastCapacity) {
            fuelTankCapacity = lastCapacity;
        }

        return fuelTankCapacity;
    }
}
