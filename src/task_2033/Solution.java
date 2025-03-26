package task_2033;

import java.util.*;


public class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> valuesArray = new ArrayList<>();

        int remainder = grid[0][0] % x;

        for (int[] ints : grid) {
            for (int value : ints) {
                if (remainder != value % x) {
                    return -1;
                }
                valuesArray.add(value);
            }
        }

        Collections.sort(valuesArray);
        int finalCommonNumber = valuesArray.get(valuesArray.size() / 2);
        int result = valuesArray.stream().reduce(0, (acc, value) -> acc + Math.abs(finalCommonNumber - value) / x);

        return result;
    }
}