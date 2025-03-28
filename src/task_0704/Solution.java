package task_0704;

public class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while(right >= left) {
            int mid = left + (right - left)/2;

            if(nums[mid] == target) {
                return mid;
            }
            if(nums[mid] > target) {
                right = mid - 1;
            }

            if(nums[mid] < target) {
                left = mid + 1;
            }
        }

        return -1;
    }
}