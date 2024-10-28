package leetcodeproblems.easy.array;

public class SingleNumber {

    public static void main(String[] args) {

        System.out.println(singleNumber(new int[]{1}));

    }

    public static int singleNumber(int[] nums) {
        int result = 0;

        for (int element : nums) {
            for (int j : nums) {
                if (element != j) {
                    result = element;
                    break;
                }
            }
        }

        return result;
    }

}
