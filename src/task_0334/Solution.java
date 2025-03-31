package task_0334;


class Solution {
    public boolean increasingTriplet(int[] nums) {
        // take element. find bigger one. find next bigger one.
        // for(int i = 0; i < nums.length - 2; i++) {
        //     int firstEl = nums[i];
        //     for(int j = i+1; j < nums.length - 1; j++) {
        //         int secondEl = nums[j];
        //         if(secondEl > firstEl) {
        //             for(int k = j+1; k < nums.length; k++) {
        //                 int thirdEl = nums[k];
        //                 if(thirdEl > secondEl) {
        //                     return true;
        //                 }
        //             }
        //         }
        //     }
        // }
        // return false;


        // track smaller elements before?
        int max1 = Integer.MAX_VALUE;
        int max2 = Integer.MAX_VALUE;
        for (int n : nums) {
            if (n <= max1) max1 = n;
            else if (n <= max2) max2 = n;
            else return true;
        }
        return false;
    }
}