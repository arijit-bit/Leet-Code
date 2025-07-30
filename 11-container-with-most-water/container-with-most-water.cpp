class Solution {
public:
    int maxArea(vector<int>& height) {
        int left = 0;
        int right = height.size()-1;
        int MAX = 0;
        int area = 0;
        int distrance;
        int level;
        while(left<right){
            distrance = right-left;
            level = min(height[right], height[left]);
            area = distrance*level;
            MAX = max(MAX, area);
            if (height[right]<height[left]){
                right--;
            }else{
                left++;
            }
        
        }
        return MAX;
        
    }
};