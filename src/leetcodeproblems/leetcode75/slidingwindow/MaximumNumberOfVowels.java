package leetcodeproblems.leetcode75.slidingwindow;

public class MaximumNumberOfVowels {

    public static void main(String[] args) {
        String s = "ibpbhixfiouhdljnjfflpapptrxgcomvnb";
        int k = 33;
        System.out.println(maxVowels(s, k));
    }

    private static int maxVowels(String s, int k) {

        if (s.length() == 1) {
            char currentElement = s.charAt(0);
            if (isVowel(currentElement)) {
                return 1;
            }
        }


        int result = 0;

        int counter = 0;

        for (int i = 0; i < k; i++) {
            char currentElement = s.charAt(i);
            if (isVowel(currentElement)) {
                counter++;
            }
        }

        result = counter;

        for (int i = k; i < s.length(); i++) {
            char currentElement = s.charAt(i);
            char prevEle = s.charAt(i - k);
            if (isVowel(currentElement)) {
                counter++;
            }

            if (isVowel(prevEle)) {
                counter--;
            }

            result = Math.max(result, counter);
        }

        return result;
    }


    public static boolean isVowel(char element) {
        return element == 'a' || element == 'e' || element == 'i' || element == 'o' || element == 'u';
    }

}
