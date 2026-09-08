class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        double sum = 0.00000;
        double avg = 0.00000;
        double ans = Integer.MIN_VALUE;

        for(int i=0; i<k; i++){
            sum += nums[i];
        }
        avg = sum/k;
        ans = Math.max(ans, avg);
        for(int i=k; i<n; i++){
            sum += nums[i];
            sum -= nums[i-k];
            avg = sum/k;
            ans = Math.max(ans, avg);
        }
        return ans;
    }
}