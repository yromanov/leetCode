package task_0763;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> lastIndexes = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            lastIndexes.put(s.charAt(i), i);
        }

        List<Integer> result = new ArrayList<>();

        int endIndex = 0;
        int startIndex = 0;
        int previousStart = 0;
        while (endIndex < s.length()) {
            while (startIndex <= endIndex) {
                Character startChar = s.charAt(startIndex);
                int lastStartCharIndex = lastIndexes.get(startChar);
                if (lastStartCharIndex > endIndex) {
                    endIndex = lastStartCharIndex;
                }
                startIndex++;
            }
            result.add(endIndex - previousStart + 1);
            endIndex++;
            previousStart = startIndex;
        }

        return result;
    }
}