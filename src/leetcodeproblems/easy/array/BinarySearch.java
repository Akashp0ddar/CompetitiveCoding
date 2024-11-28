package leetcodeproblems.easy.array;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {5};
        System.out.println(search(arr, 5));
    }

    public static int binarySearch(int[] arr, int low, int high, int target) {

        if (low > high) return -1;

        int mid = (low + high) / 2;

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return binarySearch(arr, mid + 1, high, target);
        } else {
            return binarySearch(arr, low, mid - 1, target);
        }


    }


    public static int binarySearch2(int[] arr, int target) {

        int low = 0;

        int high = arr.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static int search(int[] nums, int target) {

        return binarySearch(nums, 0, nums.length - 1, target);

    }


}
