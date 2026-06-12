class Solution {
    public int jump(int[] nums) {
        int max = 0;
        int prev = 0;
        int count = 0;
        // Iterate through array except the last element (we don't need to jump from the last position)
        for (int i=0; i<nums.length-1; i++){
            max = Math.max(max, i+nums[i]);
            if(prev == i){
                count += 1;
                prev = max;
            } 

        }
        return count;
    }
}