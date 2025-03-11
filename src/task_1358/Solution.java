package task_1358;

import java.util.HashMap;
import java.util.Map;

// sliding window: left/right pointers
// map for tracking letters
// Examples
//abcccc vs aaacb vs aaaaaabcccccccab

public class Solution {
    public int numberOfSubstrings(String s) {
        Map<Character, Integer> charsMap = new HashMap<>();

        int sLength = s.length();
        int counter = 0;
        int right = 0;
        int left = 0;

        while (right < sLength) {
            char rightChar = s.charAt(right);
            charsMap.put(rightChar, charsMap.getOrDefault(rightChar, 0) + 1);

            while (charsMap.size() == 3) {
                counter += sLength - right;

                char leftChar = s.charAt(left);
                int newCount = charsMap.get(leftChar) - 1;
                if (newCount != 0) {
                    charsMap.put(leftChar, newCount);
                } else {
                    charsMap.remove(leftChar);
                }

                left++;
            }

            right++;
        }

        return counter;
    }
}