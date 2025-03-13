package task_3356;

import java.util.Arrays;

public class Solution {
    public int minZeroArray(int[] nums, int[][] queries) {
        int[] maxValues = new int[nums.length];

        if (Arrays.stream(nums).allMatch(val -> val == 0)) {
            return 0;
        }

        int k;
        for (k = 0; k < queries.length; k++) {
            int[] action = queries[k];
            for (int i = action[0]; i <= action[1]; i++) {
                maxValues[i] += action[2];
            }

            boolean finished = true;
            for (int i = 0; i < nums.length; i++) {
                if (maxValues[i] < nums[i]) {
                    finished = false;
                    break;
                }
            }

            if (finished) {
                break;
            }
        }

        return k == queries.length ? -1 : k + 1;
    }
}
