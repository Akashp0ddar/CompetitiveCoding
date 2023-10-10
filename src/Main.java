import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        List<Long> list2 = new ArrayList<>();
        list.add(-4);
        list.add(3);
        list.add(-9);
        list.add(0);
        list.add(4);
        list.add(1);
        list2.add(1000000001L);
        list2.add(1000000002L);
        list2.add(1000000003L);
        list2.add(1000000004L);
        list2.add(1000000005L);
        System.out.println();
        Solutions.plusMinus(list);
    }
}