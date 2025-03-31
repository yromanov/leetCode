package task_0238;


class Solution {
    public int[] productExceptSelf(int[] nums) {
        int length = nums.length;
        int[] prefixes = new int[length];
        int[] suffixes = new int[length];
        prefixes[0] = 1;
        suffixes[length - 1] = 1;

        for (int i = 1; i < length; i++) {
            prefixes[i] = prefixes[i - 1] * nums[i - 1];
        }

        for (int i = length - 2; i >= 0; i--) {
            suffixes[i] = suffixes[i + 1] * nums[i + 1];
        }

        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = prefixes[i] * suffixes[i];
        }

        return result;
    }
}