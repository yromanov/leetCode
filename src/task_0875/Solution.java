package task_0875;

public class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min = 1;
        int max = 0;

        for (int pile : piles) {
            if (pile > max) {
                max = pile;
            }
        }

        while (max > min) {

            int mid = min + (max - min)  / 2;
            if (canEatBananas(piles, h, mid)) {
                max = mid;
            } else {
                min = mid + 1;
            }
        }

        return min;
    }

    boolean canEatBananas(int[] piles, int h, int k) {
        int hoursRequired = 0;
        for (int pile : piles) {
            hoursRequired += Math.ceilDiv(pile, k);

        }
        return hoursRequired <= h;
    }
}