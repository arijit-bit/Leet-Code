class Solution {
    public int maxSubArray(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for(int i=0; i<n; i++){
            count += nums[i];
            if(count>max){
                max = count;
            }
            if(count<0){
                count = 0;
            }
        }
        return max;
    }
}