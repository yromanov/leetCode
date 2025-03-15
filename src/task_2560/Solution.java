package task_2560;

public class Solution {
    public int minCapability(int[] nums, int k) {
        int minReward = 1;
        int maxReward = 0;

        for (int num : nums) {
            if (num > maxReward) {
                maxReward = num;
            }
        }

        while (minReward < maxReward) {
            int midReward = minReward + (maxReward - minReward) / 2;
            int thefts = 0;

            for (int index = 0; index < nums.length; index++) {
                if (nums[index] <= midReward) {
                    thefts += 1;
                    index++;
                }
            }

            if (thefts >= k) {
                maxReward = midReward;
            } else {
                minReward = midReward + 1;
            }
        }

        return minReward;
    }
}