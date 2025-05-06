package task_1128;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        Map<Integer, Integer> seenDominos = new HashMap<>();
        int result = 0;
        for (int[] domino : dominoes) {
            int value = domino[0] > domino[1] ?
                    domino[0] * 10 + domino[1] :
                    domino[1] * 10 + domino[0];
            int valueCount = seenDominos.getOrDefault(value, 0);
            result += valueCount;
            seenDominos.put(value, valueCount + 1);
        }

        return result;
    }
}