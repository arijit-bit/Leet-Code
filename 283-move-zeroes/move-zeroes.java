class Solution {
    public void moveZeroes(int[] nums) {
    //    Arrays.sort(nums);
        int n = nums.length;
        int count = 0;
        int index = 0;
        
        for(int i=0; i<n; i++){
            if(nums[i]!=0){
                // swap
                int temp = nums[index];
                nums[index] = nums[i];
                nums[i] = temp;
                index++;
            }
        }

       

    }
    
}