class Solution {
    public int rob(int[] nums) {
        int n = nums.length-1;
        int []dp = new int [n+2];
        Arrays.fill(dp, -1);
        if(n==0){return nums[0];}
        if(n==1) return Math.max(nums[n], nums[n-1]);
        return Math.max(bc(n,nums, dp), bc(n-1, nums, dp));
    }
    public int bc(int n, int []nums, int[] dp){
        if(n==0){ return nums[n];}
        if(n<0) return 0;
        // if(n==1){ return nums[n];}
        if(dp[n]!=-1) return dp[n];
        int take = bc(n-2, nums, dp)+nums[n];
        int not = bc(n-1, nums, dp);

        return dp[n] = Math.max(take, not);

    }
}