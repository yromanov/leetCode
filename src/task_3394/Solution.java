package task_3394;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public boolean checkValidCuts(int n, int[][] rectangles) {
        return checkCuts(rectangles, 0) || checkCuts(rectangles, 1);
    }

    private boolean checkCuts(int[][] rectangles, int dim) {
        int gapCount = 0;

        Arrays.sort(rectangles, Comparator.comparingInt(a -> a[dim]));

        int furthestEnd = rectangles[0][dim + 2];

        for (int i = 1; i < rectangles.length; i++) {
            int[] rect = rectangles[i];

            if (furthestEnd <= rect[dim]) {
                if (gapCount == 1) {
                    return true;
                }
                gapCount++;
            }

            furthestEnd = Math.max(furthestEnd, rect[dim + 2]);
        }

        return false;
    }
}