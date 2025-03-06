package task_0643;

public class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxAverage = -10000;

        for (int i = 0; i < nums.length - k + 1; i++) {
            double sum = 0;
            for (int j = 0; j < k; j++) {
                sum += nums[i + j];
            }
            double average = sum / k;
            if (average > maxAverage) {
                maxAverage = average;
            }
        }

        return maxAverage;
    }
}