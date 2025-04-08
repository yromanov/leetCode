package task_3396;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int minimumOperations(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int size = nums.length;

        for (int i = size - 1; i >= 0; i--) {
            int num = nums[i];
            if (!set.contains(num)) {
                set.add(num);
            } else {
                return i / 3 + 1;
            }
        }

        return 0;
    }
}