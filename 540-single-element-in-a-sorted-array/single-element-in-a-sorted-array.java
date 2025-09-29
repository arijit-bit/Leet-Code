class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left = 0;
        for (int i = 1; i<nums.length; i++){
            if(nums[left] < nums[i]){
                if(left==0 && i==1){
                    return nums[left];
                }
                left = i-1;

                if(i<nums.length-1){
                    if((nums[left] < nums[i])&&(nums[i]<nums[i+1])){
                        return nums[i];
                    }
                }else{
                    if(nums[nums.length-2] < nums[nums.length-1]){
                        return nums[nums.length-1];
                    }
                }
            }
        }
        return nums[nums.length-1];   
    }
}