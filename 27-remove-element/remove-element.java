class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        for(int x=0; x<n; x++){
            if(nums[x]!=val){
                nums[count]=nums[x];
                count++;
            }
        }
        return count;
    }
}