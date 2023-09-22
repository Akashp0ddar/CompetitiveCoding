public class Solutions {


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
        int end = nums.length-1;
        while (start<=end){
            int mid = start+(end-start)/2;
            if (nums[mid]==target) return mid;
            else if (nums[mid]>target) end = mid-1;
            else start = mid+1;
        }
        return start;
    }
}
