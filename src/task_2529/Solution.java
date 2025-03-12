package task_2529;

public class Solution {
    public int maximumCount(int[] nums) {
        int negCount = 0;
        int posCount = 0;

        for (int value : nums) {
            if(value > 0) {
                posCount++;
            }
            if(value < 0) {
                negCount++;
            }
        }

        return Math.max(negCount, posCount);
    }
}