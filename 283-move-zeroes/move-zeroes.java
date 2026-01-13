class Solution {
    public void moveZeroes(int[] nums) {
    //    Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        int index = 0;
        for(int i=0; i<n; i++){
            if(nums[i]==0){
               count++;
            }
        }
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                nums[index++]=nums[i];
            }else{
                continue;
            }
        }
        for(int i = n-count; i<n; i++){
            nums[i]=0;
        }

       

    }
}