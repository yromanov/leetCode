package task_2523;

import java.util.*;

public class Solution {
    public int[] closestPrimes(int left, int right) {
        boolean[] primeNumbers = new boolean[right + 1];
        for (int i = 2; i <= right; i++) {
            primeNumbers[i] = true;
        }

        for (int i = 2; i <= right; i++) {
            if (primeNumbers[i]) {
                for (int j = 2 * i; j <= right; j += i) {
                    primeNumbers[j] = false;
                }
            }
        }

        ArrayList<Integer> primes = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (primeNumbers[i]) {
                primes.add(i);
            }
        }

        if (primes.size() < 2) {
            return new int[]{-1, -1};
        }

        int firstPrime = -1;
        int secondPrime = -1;
        int minimumSum = Integer.MAX_VALUE;

        for (int i = 0; i < primes.size() - 1; i++) {
            int currentSum = primes.get(i + 1) - primes.get(i);
            if (currentSum < minimumSum) {
                minimumSum = currentSum;
                firstPrime = primes.get(i);
                secondPrime = primes.get(i + 1);
            }
        }

        return new int[]{firstPrime, secondPrime};
    }
}