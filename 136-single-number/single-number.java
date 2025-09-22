class Solution {
    public int singleNumber(int[] nums) {
        int target = 0;
        if(nums.length == 1){
            return nums[0];
        }else{

            for(int i=0; i<nums.length; i++){
                target = target^nums[i];
            }
            return target;
        }
    }
}