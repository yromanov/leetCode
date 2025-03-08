package task_2379;

// Idea: find a k-sized window with most black blocks

public class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minWhiteBlocks = 0;

        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                minWhiteBlocks++;
            }
        }

        int currentWhiteBlocks = minWhiteBlocks;

        for (int i = 1; i < blocks.length() - k + 1; i++) {
            if (blocks.charAt(i - 1) == 'W') {
                currentWhiteBlocks--;
            }
            if (blocks.charAt(i + k - 1) == 'W') {
                currentWhiteBlocks++;
            }

            if (currentWhiteBlocks == 0) {
                return 0;
            }

            if (currentWhiteBlocks < minWhiteBlocks) {
                minWhiteBlocks = currentWhiteBlocks;
            }
        }

        return currentWhiteBlocks;
    }
}