package task_0080;

public class Solution {
    public int removeDuplicates(int[] nums) {
        int readIndex = 0;
        int writeIndex = 0;

        while (readIndex < nums.length) {
            int count = 1;
            int value = nums[readIndex];
            while ((readIndex < nums.length - 1) && value == nums[readIndex + 1]) {
                count++;
                readIndex++;
            }
            nums[writeIndex++] = value;
            if (count > 1) {
                nums[writeIndex++] = value;
            }
            readIndex++;
        }

        return writeIndex;
    }

    public int removeDuplicatesSimple(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i < 2 || n > nums[i - 2]) {
                nums[i++] = n;
            }
        }
        return i;
    }
}