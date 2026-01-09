class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int pointer = 0;
        nums[pointer] = nums[0];
        pointer++;
        for(int i=1; i<n; i++){
            if(nums[pointer-1] == nums[i]){
                continue;
            }else{
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        return pointer;
    }
}