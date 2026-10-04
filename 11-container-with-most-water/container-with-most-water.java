class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int left  = 0;
        int right = n-1;
        int mxArea = 0;
        while(left < right){
            int width = right-left;
            int hei = Math.min(height[left], height[right]);
            int area = hei*width;
            mxArea = Math.max(area, mxArea);
            if(height[left]<height[right]) left++;
            else right--;

        }
        return mxArea;
    }
}