class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int maxsum = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            sum = sum+nums[i];
            maxsum = Math.max(sum, maxsum);
            if(sum<0) sum = 0;
        }
        return maxsum;
    }
}