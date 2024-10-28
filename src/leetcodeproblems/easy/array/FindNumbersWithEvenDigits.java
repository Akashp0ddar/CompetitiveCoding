package leetcodeproblems.easy.array;

public class FindNumbersWithEvenDigits {

    public static void main(String[] args) {

        System.out.println(findNumbers(new int[]{555, 901, 482, 1771}));

    }


    public static int findNumbers(int[] nums) {
        int result = 0;

        for (int element : nums) {
            if ((String.valueOf(element).length() & 1) == 0) {
                result++;
            }
        }

        return result;
    }
}
