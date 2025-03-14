package task_2226;

public class Solution {
    public int maximumCandies(int[] candies, long k) {
        int left = 0;
        int right = 0;

        for (int pile : candies) {
            if (pile > right) {
                right = pile;
            }
        }

        while (right > left) {
            int mid = (left + right + 1) / 2;
            if (checkCandies(candies, k, mid)) {
                left = mid;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }

    boolean checkCandies(int[] candies, long countLeft, long amount) {
        for (int pile : candies) {
            countLeft -= pile / amount;
            if (countLeft <= 0) {
                return true;
            }
        }

        return false;
    }
}