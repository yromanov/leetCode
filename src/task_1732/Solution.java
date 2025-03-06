package task_1732;

public class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int current = 0;

        for (int alt : gain) {
            current += alt;
            if (current > max) {
                max = current;
            }
        }

        return max;
    }
}