package task_0643;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double currentSum = 0;

        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        double maxSum = currentSum;

        for (int i = k; i < nums.length; i++) {
            currentSum = currentSum - nums[i - k] + nums[i];
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum / k;
    }
}