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
}