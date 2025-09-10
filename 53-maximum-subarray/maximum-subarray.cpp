class Solution {
public:
    int maxSubArray(vector<int>& nums) {
        int maxval = INT_MIN;
        int current = 0;
        for (int i = 0; i< nums.size(); i++){
            current += nums[i];
            if (current>maxval){
                maxval = current;
            }
            if(current < 0){
                current = 0;
            }
        }
        return maxval;
    }
};