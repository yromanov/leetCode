package task_1207;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurencesMap = new HashMap<>();

        for (int value : arr) {
            int currentValue = occurencesMap.getOrDefault(value, 0);
            occurencesMap.put(value, currentValue + 1);
        }

        Set<Integer> set = new HashSet<>();

        for (int count : occurencesMap.values()) {
            if (set.contains(count)) {
                return false;
            } else {
                set.add(count);
            }
        }

        return true;
    }
}