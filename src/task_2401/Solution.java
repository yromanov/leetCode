package task_2401;

public class Solution {
    public int longestNiceSubarray(int[] nums) {
        int maxLength = 1;
        int leftIndex = 0;
        int usedBits = 0;

        for (int rightIndex = 0; rightIndex < nums.length; rightIndex++) {
            while (((usedBits & nums[rightIndex]) != 0)) {
                usedBits ^= nums[leftIndex];
                leftIndex++;
            }

            usedBits |= nums[rightIndex];

            int length = rightIndex - leftIndex + 1;
            if (length > maxLength) {
                maxLength = length;
            }
        }

        return maxLength;
    }
}