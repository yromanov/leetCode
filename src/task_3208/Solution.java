package task_3208;

public class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int result = 0;
        int alternatingElementsCount = 1;
        int lastColor = colors[0];

        for (int i = 1; i < colors.length + k - 1; i++) {
            int index = i % colors.length;

            if (colors[index] != lastColor) {
                alternatingElementsCount += 1;

                if (alternatingElementsCount >= k) {
                    result++;
                }
            } else {
                alternatingElementsCount = 1;
            }
            lastColor = colors[index];
        }

        return result;
    }
}
