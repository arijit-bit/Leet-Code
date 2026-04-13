class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int count = 0;
        for(int x=0; x<n; x++){
            if(nums[x]==val){
                nums[x]=51;
                count++;
            }
        }
        Arrays.sort(nums);
        return n-count;
    }
}