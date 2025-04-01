package task_2140;


public class Solution {
    public long mostPoints(int[][] questions) {
        long[] dp = new long[questions.length];
        return dfs(questions, 0, dp);
    }

    public long dfs(int[][] questions, int i, long[] dp) {
        if (i >= questions.length) return 0;
        if (dp[i] > 0) return dp[i];
        int points = questions[i][0];
        int jump = questions[i][1];
        return dp[i] =
                Math.max(
                        dfs(questions, i + 1, dp),
                        points + dfs(questions, i + jump + 1, dp)
                );
    }
}