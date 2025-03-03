package task_2161;

import java.util.ArrayList;

public class Solution {
    public int[] pivotArray(int[] nums, int pivot) {

        int pivotCount = 0;
        ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> more = new ArrayList<>();

        for (int val : nums) {
            if (val < pivot) {
                less.add(val);
            } else if (val > pivot) {
                more.add(val);
            } else {
                pivotCount++;
            }
        }

        ArrayList<Integer> result = new ArrayList<>(less);
        for (int i = 0; i < pivotCount; i++) {
            result.add(pivot);
        }
        result.addAll(more);

        int i = 0;
        int[] ans = new int[result.size()];
        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }
}