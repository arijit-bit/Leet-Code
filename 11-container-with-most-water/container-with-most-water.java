class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int right = n-1;
        int left  = 0;
        int area = 0;
        int ans = 0;
        while(left<right){
            area = (right - left) * Math.min(height[left], height[right]);
            ans = Math.max(ans, area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return ans;
    }
}