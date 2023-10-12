import java.util.ArrayList;
import java.util.List;

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
     * <a href="https://leetcode.com/problems/search-insert-position/">...</a>
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

}
