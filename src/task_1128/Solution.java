package task_1128;



public class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int result = 0;
        int length = dominoes.length;
        for(int i = 0; i < length; i++) {
            int[] domino = dominoes[i];

            for(int j = i+1; j < length; j++) {
                int[] domino2 = dominoes[j];

                if((domino[0] == domino2[0] && domino[1] == domino2[1])
                        || (domino[0] == domino2[1] && domino[1] == domino2[0])) {
                    result++;
                }
            }
        }

        return result;
    }
}