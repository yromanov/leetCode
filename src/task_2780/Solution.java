package task_2780;

import java.util.*;

public class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer, Integer> left = new HashMap<>();
        HashMap<Integer, Integer> right = new HashMap<>();

        for (int num : nums) {
            right.put(num, right.getOrDefault(num, 0) + 1);
        }

        int size = nums.size();
        for (int i = 0; i < size; i++) {
            int num = nums.get(i);
            left.put(num, left.getOrDefault(num, 0) + 1);
            right.put(num, right.getOrDefault(num, 0) - 1);

            if (left.get(num) * 2 > i + 1 && right.get(num) * 2 > size - i - 1) {
                return i;
            }
        }

        return -1;
    }
}