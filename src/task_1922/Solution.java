package task_1922;

public class Solution {
    long mod = 1000000007;

    public int countGoodNumbers(long n) {
        return (int) ((pow(5, (n + 1) / 2) * pow(4, n / 2)) % mod);
    }

    public long pow(int x, long y) {
        long result = 1;
        long mult = x;
        while (y > 0) {
            if (y % 2 == 1) {
                result = (result * mult) % mod;
            }
            mult = (mult * mult) % mod;
            y /= 2;
        }

        return result;
    }
}