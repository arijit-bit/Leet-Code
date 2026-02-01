class Solution {
    public int minimumCost(int[] nums) {
        int a = nums[0];
        nums[0]=Integer.MIN_VALUE;
        Arrays.sort(nums);
        int b = nums[1];
        int c = nums[2];
    return a+b+c;
    }
}