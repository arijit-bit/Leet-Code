class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        
        int count = 0;
        int ans = 0;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]+1 == nums[i+1]){
                count++;
            }
            if(nums[i]==nums[i+1]) continue ;

            if(nums[i]+1 != nums[i+1]){
                count = 0;
            }
            ans = Math.max(ans, count);

        }
        return ans+1;
    }
}