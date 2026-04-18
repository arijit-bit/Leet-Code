class Solution {
    public int climbStairs(int n) {
        int []dp = new int [n+1];
        Arrays.fill(dp, -1);
        return countWays(n, dp);
    }
    private int countWays(int n, int[] dp){
        if(n==0) return 1;
        if(n==1) return 1;

        if(dp[n]!= -1) return dp[n];
        int step1 = countWays(n-1, dp);
        int step2 = countWays(n-2, dp);
        return dp[n] = step1+step2;
    }
}