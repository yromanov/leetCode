package task_3191;

public class Solution {
    public int minOperations(int[] nums) {
        int count = 0;
        int length = nums.length;

        for(int i = 0; i < length-2; i++) {
            if(nums[i] == 0) {
                count++;
                nums[i] = 1;
                nums[i+1] ^= 1;
                nums[i+2] ^= 1;
            }
        }

        return nums[length -1] == 1 && nums[length-2] == 1 ? count : -1;
    }
}