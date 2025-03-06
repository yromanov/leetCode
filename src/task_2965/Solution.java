package task_2965;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeated = -1;
        int missed = -1;
        int n = grid.length;

        Set<Integer> seen = new HashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int value = grid[i][j];
                if (seen.contains(value)) {
                    repeated = value;
                } else {
                    seen.add(value);
                }
            }
        }
        for (int i = 1; i <= n * n; i++) {
            if (!seen.contains(i)) {
                missed = i;
                break;
            }
        }
        return new int[]{repeated, missed};
    }
}
