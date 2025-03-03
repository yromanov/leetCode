package task_0605;

public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int emptyPlaces = 0;
        if (n == 0) {
            return true;
        }
        int i = 0;
        while (i < flowerbed.length) {
            if (flowerbed[i] == 0) {
                if (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) {
                    emptyPlaces++;
                    i += 2;
                } else {
                    i++;
                }
            } else {
                i += 2;
            }

            if (n == emptyPlaces) {
                return true;
            }
        }
        return false;
    }
}