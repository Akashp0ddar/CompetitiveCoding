import java.util.*;

public class Solutions {


    /**
     * <a href="https://www.hackerrank.com/challenges/solve-me-first/problem">...</a>
     */
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
     * <a href="https://www.hackerrank.com/challenges/simple-array-sum/problem">...</a>
     */
    public static int simpleArraySum(List<Integer> ar) {
        int sum = 0;
        // Write your code here
        for (int i : ar) {
            sum += i;
        }
        return sum;
    }

    // 30 Day Logic building

    /**
     * <a href="https://www.hackerrank.com/challenges/compare-the-triplets/problem">...</a>
     */
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> score = new ArrayList<>(2);
        int aliceScore = 0;
        int bobScore = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) < b.get(i)) {
                bobScore++;
            } else if (a.get(i) > b.get(i)) {
                aliceScore++;
            }
        }
        score.add(aliceScore);
        score.add(bobScore);
        return score;
    }

    /**
     * <a href="https://www.hackerrank.com/challenges/a-very-big-sum/problem">...</a>
     */
    public static long aVeryBigSum(List<Long> ar) {
        // Write your code here
        Long i = 0L;
        for (Long g : ar) {
            i += g;
        }
        return i;
    }

    /**
     * <a href="https://www.hackerrank.com/challenges/mini-max-sum/problem">...</a>
     */
    public static void miniMaxSum(List<Integer> arr) {
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        Long sum = 0L;
        for (int i = 0; i < arr.size(); i++) {
            Integer num = arr.get(i);
            sum += num;
            if (max < num)
                max = num;
            if (min > num)
                min = num;
        }
        System.out.println((sum - max) + " " + (sum - min));

    }

    /**
     * <a href="https://www.hackerrank.com/challenges/plus-minus/problem">
     * </a>
     */
    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        float positiveValue = 0f;
        float negativeValue = 0f;
        float zero = 0f;
        for (Integer integer : arr) {
            if (integer > 0) {
                positiveValue++;
            } else if (integer < 0) {
                negativeValue++;
            } else {
                zero++;
            }
        }

        String positiveOutput = String.format("%.6f", positiveValue / arr.size());
        String negativeOutput = String.format("%.6f", negativeValue / arr.size());
        String zeroOutput = String.format("%.6f", zero / arr.size());
        System.out.println(positiveOutput + "\n" + negativeOutput + "\n" + zeroOutput);

    }

    /**
     * <a href="https://www.hackerrank.com/challenges/time-conversion/problem">...</a>
     */
    public static String timeConversion(String s) {
//         Write your code here
        String hello = "";
        String hour = s.substring(0, 2);
        int numberHour = Integer.parseInt(hour);
        if (s.contains("AM")) {
            if (numberHour == 12) {
                hello = "00" + s.substring(2, 8);
            } else {
                hello = "0" + numberHour + s.substring(2, 8);
            }
        } else if (s.contains("PM")) {
            if (numberHour < 12) {
                if (String.valueOf(numberHour + 12).equals("12")) {
                    hello = "00" + s.substring(2, 8);
                } else {
                    hello = numberHour + 12 + s.substring(2, 8);
                }
            } else if (numberHour == 12) {
                hello = numberHour + s.substring(2, 8);
            }
        }

        return hello;

    }


    public static String timeConversionChatGPT(String timeStr) {
        String[] timeParts = timeStr.substring(0, timeStr.length() - 2).split(":");
        int hours = Integer.parseInt(timeParts[0]);
        int minutes = Integer.parseInt(timeParts[1]);
        int seconds = Integer.parseInt(timeParts[2]);
        String amPm = timeStr.substring(timeStr.length() - 2);

        // Handle the case of 12:00:00AM or 12:00:00PM
        if (hours == 12) {
            hours = 0;
        }

        // Adjust hours for PM times
        if (amPm.equals("PM")) {
            hours += 12;
        }

        // Convert back to string format with zero padding
        String result = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        return result;
    }

    /**
     * <a href="https://www.hackerrank.com/challenges/apple-and-orange/problem">...</a>
     */
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        // Write your code here
        int appleCount = 0;
        int orangeCount = 0;
        apples.replaceAll(integer -> integer + a);
        oranges.replaceAll(integer -> integer + b);
        for (int apple : apples) {
            if (apple >= s && apple <= t) {
                appleCount++;
            }
        }

        for (int orange : oranges) {
            if (orange >= s && orange <= t) {
                orangeCount++;
            }
        }

        System.out.println(appleCount + "\n" + orangeCount);

    }

    /**
     * <a href="https://www.hackerrank.com/challenges/divisible-sum-pairs/problem">...</a>
     */

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int pairs = 0;
        for (int i = 0; i < ar.size(); i++) {
            for (int j = i + 1; j < ar.size(); j++) {
                if ((ar.get(i) + ar.get(j)) % k == 0) {
                    pairs++;
                }
            }
        }
        return pairs;
    }

    /**
     * <a href="https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem">...</a>
     */
    public static List<Integer> breakingRecords(List<Integer> scores) {
        // Write your code here
        int min = 0;
        int max = 0;
        int minScore = scores.get(0);
        int maxScore = scores.get(0);
        List<Integer> minMaxList = new ArrayList<>();

        for (Integer score : scores) {
            if (score > minScore) {
                minScore = score;
                min++;
            }

            if (score < maxScore) {
                maxScore = score;
                max++;
            }

        }


        minMaxList.add(min);
        minMaxList.add(max);
        return minMaxList;
    }

    /**
     * <a href="https://www.hackerrank.com/challenges/the-birthday-bar/problem">...</a>
     */
    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int divided = 0;
        int sum;
        for (int i = 0; i < s.size() - m + 1; i++) {
            sum = s.get(i);
            for (int j = 0; j < i + m - 1; j++) {
                sum = sum + s.get(j);
            }

            if (sum == d) {
                divided++;
            }
            sum = 0;
        }
        return divided;
    }

    /**
     * <a href="https://www.hackerrank.com/challenges/kangaroo/problem">...</a>
     */
    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // Write your code here
        if (v1 > v2 && (x2 - x1) % (v1 - v2) == 0) return "YES";
        return "NO";
    }

    /**
     * <a href="https://www.hackerrank.com/challenges/migratory-birds/problem">...</a>
     */
    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int frequency = 0;
        int mostFrequentElement = 0;
        for (int i = 0; i < arr.size(); i++) {
            int count = 0;
            for (int j = i + 1; j < arr.size(); j++) {
                if (Objects.equals(arr.get(i), arr.get(j))) {
                    count++;
                }
            }

            if (count > frequency) {
                frequency = count;
                mostFrequentElement = arr.get(i);
            }
        }
        return mostFrequentElement;
    }

    /**
     * <a href="https://atcoder.jp/contests/abc325/tasks/abc325_a">...</a>
     */
    private static String takashiSan(String s, String T) {
        return s + " " + "san";
    }

    /**
     * <a href="https://leetcode.com/problems/remove-element/">...</a>
     */
    public int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }

    /**
     * <a  href="https://leetcode.com/problems/search-insert-position/">problemLink</a>
     */
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) end = mid - 1;
            else start = mid + 1;
        }
        return start;
    }

    /**
     * <a href="https://leetcode.com/problems/merge-strings-alternately/?envType=study-plan-v2&envId=leetcode-75">...</a>
     */
    public String mergeAlternately(String word1, String word2) {
        char[] word1Arr = word1.toCharArray();
        char[] word2Arr = word2.toCharArray();
        StringBuilder sb = new StringBuilder();
        if (word1.length() > word2.length()) {
            for (int i = 0; i < word2Arr.length; i++) {
                sb.append(word1Arr[i]);
                sb.append(word2Arr[i]);

            }
            sb.append(word1.substring(word2Arr.length));

        } else if (word2.length() > word1.length()) {

            for (int i = 0; i < word1Arr.length; i++) {
                sb.append(word1Arr[i]);
                sb.append(word2Arr[i]);
            }
            sb.append(word2.substring(word1Arr.length));
        } else {
            for (int i = 0; i < word1Arr.length; i++) {
                sb.append(word1Arr[i]);
                sb.append(word2Arr[i]);
            }
        }
        return String.valueOf(sb);
    }


    /**
     * <a href="https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/?envType=study-plan-v2&envId=leetcode-75">...</a>
     * watch solution
     */
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> result = new ArrayList<>(candies.length);

        int max = candies[0];

        for (int i = 1; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        for (int i = 0; i < candies.length; i++) {
            candies[i] = candies[i] + extraCandies;
            if (candies[i] >= max) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }


    /**
     * <a href="https://leetcode.com/problems/reverse-vowels-of-a-string/description/?envType=study-plan-v2&envId=leetcode-75">...</a>
     * 290/480 test cases passed
     * at last watched submission
     */
    public String reverseVowels(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                stack.add(currentChar);
            }
        }

        for (char c : s.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                sb.append(stack.pop());

            } else {
                sb.append(c);
            }
        }
        return sb.toString();

    }


    /**
     * <a href="https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&envId=leetcode-75">...</a>
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int zeros = 0;
        int maxFlowers = 0;
        for (int i : flowerbed) {
            if (i == 0) {
                zeros++;
            } else {
                maxFlowers += (zeros - 1) / 2;
                zeros = 0;

            }
        }
        return maxFlowers >= n;
    }


    public int firstMissingPositive(ArrayList<Integer> A) {
//        Arrays.s
        Collections.sort(A);

        if (A.size() == 1) {
            return A.get(0) + 1;
        }

        for (int i = 0; i < A.size(); i++) {
            if (A.get(0) < 0) {
                return 1;
            }

            if (A.get(i) - A.get(i + 1) > 1) {
                return A.get(i) + 1;
            }

            if (A.get(0) > 1) {
                return A.get(0) - 1;
            }

        }

        return 0;
    }


    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int zeros = 0;
        int ones = 0;

        for (int i : A) {
            if (i == 0) {
                zeros++;
            } else {
                ones++;
            }
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < zeros; i++) {
            arrayList.add(0);
        }

        for (int i = 0; i < ones; i++) {
            arrayList.add(1);
        }

        return arrayList;
    }


    /**
     * <a href="https://leetcode.com/problems/reverse-words-in-a-string/?envType=study-plan-v2&envId=leetcode-75">Reverse Words in a String</a>
     */

    public String reverseWords(String s) {

        String[] words = s.split(" ");

        StringBuilder newWord = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            if (!Objects.equals(words[i], "")) {

                newWord.append(words[i]).append(" ");
            }
        }


        return newWord.toString().trim();
    }

    /***
     *<a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/">...</a>
     * */
    public int removeDuplicates(int[] nums) {

        ArrayList<Integer> nonDuplicate = new ArrayList<>();

        // removing duplicate
        for (int num : nums) {

            if (!nonDuplicate.contains(num)) {
                nonDuplicate.add(num);
            }

        }

        for (int i = 0; i < nonDuplicate.size(); i++) {
            nums[i] = nonDuplicate.get(i);
        }

        return nonDuplicate.size();

    }


    public boolean increasingTriplet(int[] nums) {

        if (nums.length < 3) {
            return false;
        }

        for (int i = 0; i < nums.length; i++) {

//            int first = nums[i];
//            int j = nums[i + 1];
//            int k = nums[i + 2];
//
//            if (first < j ) {
//
//                if (j<k){
//
//                    return true;
//                }
//            }

        }

        return false;
    }


    public ListNode modifiedList(int[] nums, ListNode head) {
        if (nums == null || nums.length == 0) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int num : nums) {
            current.next = new ListNode(num);
            current = current.next;
        }

        return dummy.next;
    }
}