import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();
        List<Integer> list2 = new ArrayList<>();
        list.add(-2);
        list.add(2);
        list.add(1);
        list2.add(5);
        list2.add(-6);
        Solutions.countApplesAndOranges(7,11,5,15,list,list2);

    }
}