class Solution {
    public boolean canPartition(int[] nums) {
        // ArrayList<Integer> op = new ArrayList<>();
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            sum += nums[i]; 
        }
        System.out.println(sum);
        if(sum%2 != 0){
            return false;
        }
        Boolean memo [][] = new Boolean[nums.length][sum/2+1];
        return helper(sum/2, 0, nums, 0, memo);

        
    }
    private boolean helper(int target, int sum, int[] nums, int index, Boolean[][] memo){
        if(sum == target){
            return true;
        }
        if(sum > target) {
            return false;
        }
        // System.out.println(sum);
        if(index == nums.length){
            return false;
        }
        if(memo[index][sum] != null){
            return memo[index][sum];
        }
        boolean take = helper(target, sum+nums[index], nums, index+1, memo);
        boolean skip = helper(target, sum, nums, index+1, memo);
        memo[index][sum] = take||skip;
        return memo[index][sum];
    }
}