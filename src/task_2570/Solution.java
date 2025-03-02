package task_2570;

import java.util.*;

public class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

        TreeMap<Integer, Integer> map = new TreeMap<>();

        for (int[] array : nums1) {
            int id = array[0];
            int value = array[1];
            map.put(id, value);
        }

        for (int[] array : nums2) {
            int id = array[0];
            int value = array[1];
            int newValue = map.getOrDefault(id, 0) + value;
            map.put(id, newValue);
        }

        ArrayList<int[]> arrayList = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            arrayList.add(new int[]{entry.getKey(), entry.getValue()});
        }

        return arrayList.toArray(new int[][]{});
    }
}
