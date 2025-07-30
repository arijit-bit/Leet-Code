class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int left = 0;
        int right = nums.size();
        for(int i=0; i<right; i++){
            for (int j=i+1; j<right; j++){
                int sum = nums[i] + nums[j];
                if(sum == target){
                    return {i,j};
                }
            }
        }
        return {};
    }
};
