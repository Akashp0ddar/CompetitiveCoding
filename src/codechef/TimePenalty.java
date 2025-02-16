package codechef;

import java.util.Scanner;

public class TimePenalty {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contestStart = sc.nextInt();
        int incorrectSubmissions = sc.nextInt();
        System.out.println(contestStart + incorrectSubmissions * 10);
    }
}
