class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0, ans, new ArrayList<>());
        return ans;
    }

    private void backtrack(int[] nums, int index, 
                           List<List<Integer>> ans, 
                           List<Integer> temp) {

        // Add current subset
        ans.add(new ArrayList<>(temp));

        for (int i = index; i < nums.length; i++) {
            // Include element
            temp.add(nums[i]);

            backtrack(nums, i + 1, ans, temp);

            temp.remove(temp.size() - 1);
        }
    }
}
