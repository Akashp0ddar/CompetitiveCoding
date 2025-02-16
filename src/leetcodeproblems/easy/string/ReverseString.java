package leetcodeproblems.easy.string;

import java.util.Arrays;

public class ReverseString {

    public static void main(String[] args) {
        char[] arr = {'h', 'e', 'l', 'l', 'o'};
        reverseString(arr);

        System.out.println(Arrays.toString(arr));
    }


    public static void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;


        while (i < j) {
            char t = s[i];
            s[i] = s[j];
            s[j] = t;
            i++;
            j--;
        }

    }

}
