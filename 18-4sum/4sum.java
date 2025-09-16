class Solution {
    public List<List<Integer>> fourSum(int[] nums, int t) {
       List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums); // Sort first
        int n = nums.length;
        long target = t;
        


        for(int j=0; j<n-3; j++){
            if (j > 0 && nums[j] == nums[j - 1]) continue;
            for (int i = j+1; i < n - 2; i++) {
            if (i > j+1 && nums[i] == nums[i - 1]) continue; // Skip duplicate 'i'

            int left = i + 1, right = n - 1;

            while (left < right) {
                long sum = (long) nums[j] + nums[i] + nums[left] + nums[right];

                if (sum == target) {
                    ans.add(Arrays.asList(nums[j], nums[i], nums[left], nums[right]));

                    // Move left & right pointers to skip duplicates
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;

                    left++;
                    right--;

                } else if (sum <  target) {
                    left++; // Need bigger sum
                } else {
                    right--; // Need smaller sum
                }
            }
        }
        }
        return ans;
    }
}