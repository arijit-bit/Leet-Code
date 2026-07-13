class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i]==nums[i-1])continue;
            int curr = nums[i];
            int left = i+1;
            int right = n-1;
            while(left<right){
                
                int sum = nums[left] + nums[right] + curr;
                if(sum == 0){
                    List<Integer> temp = new ArrayList();
                    temp.add(curr);
                    temp.add(nums[left]);
                    temp.add(nums[right]);
                    ans.add(temp);
                    while(left<right && nums[left]==nums[left+1])left++;
                    while(left<right && nums[right]==nums[right-1])right--;

                }
                if(sum<0){
                    left++;
                }else{
                    right--;
                }
            }
        }
        return ans;
    }
}