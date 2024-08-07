import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solutions sol = new Solutions();

//        ArrayList<Integer> arrayList = new ArrayList<>();
//        int n = sc.nextInt();
//        int counter = 0;
//        String[] arr = new String[n];
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.next();
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//
//            counter++;
//            if (arr[i].equals("sweet")) {
//
//                if (i + 1 < arr.length && arr[i + 1].equals("sweet")) {
//                    counter++;
//                    break;
//                }
//            }
//
//        }
//
//
//
//        if (counter == arr.length) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }

//        olympics2024(sc);

        int testCases = sc.nextInt();

        for (int i = 0; i < testCases; i++) {
            System.out.println(noWinner(sc));
        }
    }


    public static void olympics2024(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;

        if (a != 5) {
            counterA = 5 - a;
        }

        if (b != 5) {
            counterB = 5 - b;
        }

        if (c != 5) {
            counterC = 5 - c;
        }

        System.out.println(counterA + counterB + counterC);


    }


    public static String noWinner(Scanner sc) {
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        int C = sc.nextInt();
//        int M = sc.nextInt();

        int alice = sc.nextInt();
        int bob = sc.nextInt();
        int cameron = sc.nextInt();
        int additionalMatches = sc.nextInt();


//        3
//        3 5 2 1
//        4 4 2 5
//        1 4 7 2

//        if(A+M == B || A+M == C || B+M== C || B+M== A || C+M == A || C+M == B){
//            return "Yes";
//        }
//
//        if(A==B || B==C || C==A)    return "Yes";

        if (additionalMatches + cameron == alice || additionalMatches + cameron == bob || alice == bob) {
            return "Yes";
        }

        if (additionalMatches + bob == alice || additionalMatches + bob == cameron || alice == cameron) {
            return "Yes";
        }


        if (additionalMatches + alice == bob || additionalMatches + alice == cameron || bob == cameron) {
            return "Yes";
        }


        return "No";

    }


}


