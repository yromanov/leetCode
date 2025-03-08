package task_2379;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// Idea: find a k-sized window with most black blocks

public class Solution {
    public int minimumRecolors(String blocks, int k) {
        int currentBlackBlocksCount = 0;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'B') {
                currentBlackBlocksCount++;
            }
        }

        int maxBlackBlocksCount = currentBlackBlocksCount;

        for (int i = 1; i < blocks.length() - k + 1; i++) {
            if (blocks.charAt(i - 1) == 'B') {
                currentBlackBlocksCount--;
            }
            if (blocks.charAt(i + k - 1) == 'B') {
                currentBlackBlocksCount++;
            }

            if (currentBlackBlocksCount > k) {
                return 0;
            }

            if (currentBlackBlocksCount > maxBlackBlocksCount) {
                maxBlackBlocksCount = currentBlackBlocksCount;
            }
        }

        return k - maxBlackBlocksCount;
    }
}