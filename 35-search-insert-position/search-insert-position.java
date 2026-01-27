class Solution {
    private int backtrack(int[] nums, int s, int e, int target){
        int mid = s+(e-s)/2;
        if(s>e){
           return s;
        }
        if(nums[mid]==target){
            return mid;
        }
        if(nums[mid]<target){
            return backtrack(nums, mid+1, e, target);
        }else{
            return backtrack(nums, s, mid-1, target);
        }
    }
    public int searchInsert(int[] nums, int target) {
        int e = nums.length-1;
        int s = 0;
        int ans = backtrack(nums, s, e, target);
        return ans;
    }
    
}