package task_0001;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            Integer complementId = map.get(complement);
            if (complementId != null && complementId != i) {
                return new int[] { i, complementId };
            }
        }

        return new int[] {};
    }
}