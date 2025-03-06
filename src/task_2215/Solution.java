package task_2215;

import java.util.*;

public class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int val : nums1) {
            set1.add(val);
        }

        for(int val : nums2) {
            set2.add(val);
        }

        List<Integer> list1 = set1.stream().filter(val -> !set2.contains(val)).toList();
        List<Integer> list2 = set2.stream().filter(val -> !set1.contains(val)).toList();

        return List.of(list1, list2);
    }
}