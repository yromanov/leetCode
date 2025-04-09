package task_3375;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int minOperations(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num < k) {
                return -1;
            }
            set.add(num);
        }
        int setSize = set.size();

        return set.contains(k) ? setSize - 1 : setSize;
    }
}