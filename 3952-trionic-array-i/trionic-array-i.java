class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if(n<4){return false;}
        int first = nums[0];
        int last = nums[n-1];
        int p = 0;
        int q = n-1;
        for(int i=0; i<n-1; i++){
            if(nums[i]==nums[i+1]){
                return false;
            }
        }
        for(int i=1; i<n-1; i++){
        //    p = Math.max(largest,nums[i]);
        //    q = Math.max(largest,nums[i]);
            if(nums[i]<nums[i-1]){
                p = i-1;
                break;
            }
        }
        if(nums[p]==first){
            return false;
        }
        for(int i=p; i<n-1; i++){
            if(nums[i]<nums[i+1]){
               q = i; 
               break;
            }
        }
        if(nums[q]==last){
            return false;
        }
        for(int i=q; i<n-1; i++){
            if(nums[i] > nums[i+1]){
                return false;
            }
        }
        if(first<nums[p] && nums[p]>nums[q] && nums[q]<last){
            return true;
        }
    return false;
    }
}