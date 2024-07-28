import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solutions sol = new Solutions();

        ArrayList<Integer> arrayList = new ArrayList<>();


//        int n = sc.nextInt();
//        int count = 0;
//
//        ArrayList<String> arr = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            String name = sc.next();
//            count += sc.nextInt();
//            arr.add(name);
//        }
//        Collections.sort(arr);
//        System.out.println(arr.get(count%n));

        System.out.println(ValidateMathExpression.isValidMathExpression("1 plus 2 minus 3"));


        //mouse move
//        int xCoord = 500;
//        int yCoord = 500;
//
//        // Move the cursor
//        while (true){
//
//            Robot robot = new Robot();
//            robot.mouseMove(xCoord, yCoord);
//            Thread.sleep(5000);
//        }


    }

}


