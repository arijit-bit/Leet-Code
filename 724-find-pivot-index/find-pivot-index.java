class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum = 0;
        int rightsum = 0;
        int n = nums.length;
        for(int num: nums){
            leftsum += num;
        }
        for(int i=0; i<n; i++){
            

            if((leftsum - rightsum - nums[i]) == rightsum) return i;
            rightsum += nums[i];
            

        }
        return -1;
    }
}