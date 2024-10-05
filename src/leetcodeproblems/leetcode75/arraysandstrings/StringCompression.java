package leetcodeproblems.leetcode75.arraysandstrings;

import java.util.Arrays;

public class StringCompression {

    public static void main(String[] args) {

        char[] arr = {'a', 'a', 'b', 'b', 'c', 'c', 'c'};
        char[] arr2 = {'a', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'};

        System.out.println(compress(arr));
        System.out.println(Arrays.toString(arr));

    }


    public static int compress(char[] chars) {

        StringBuilder stringBuilder = new StringBuilder();


        char prev = chars[0];

        int counter = 0;


        for (char aChar : chars) {
            if (aChar == prev) {
                counter++;
            } else {
                stringBuilder.append(prev);
                if (counter != 1)
                    stringBuilder.append(counter);
                prev = aChar;
                counter = 1;
            }
        }

        stringBuilder.append(prev);
        if (counter != 1)
            stringBuilder.append(counter);


        for (int i = 0; i < stringBuilder.length(); i++) {
            chars[i] = stringBuilder.charAt(i);
        }

        return stringBuilder.length();
    }

}
