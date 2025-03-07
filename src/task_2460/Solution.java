package task_2460;


import java.util.Arrays;

public class Solution {
    public int[] applyOperations(int[] nums) {
        int length = nums.length;

        for (int i = 0; i < length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        int nonZeroIndex = 0;

        for (int i = 0; i < length; i++) {
            if(nums[i] != 0){
                nums[nonZeroIndex++] = nums[i];
            }
        }

        Arrays.fill(nums, nonZeroIndex, length, 0);

        return nums;
    }
}