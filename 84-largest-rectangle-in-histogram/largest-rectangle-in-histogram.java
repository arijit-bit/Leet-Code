class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        int max = 0;
        Stack <Integer> st = new Stack <>();
        for(int i=0; i<= n; i++){
            int curr = (i==n)? 0 : heights[i];
            //(i==n)? 0 for the last call to pop and compute all inserted value in stack as 0 is smallest
            while(!st.isEmpty() && curr< heights[st.peek()]){
                int h = heights[st.pop()];
                int w = st.isEmpty() ? i : i-st.peek()-1;
                max = Math.max(max, h*w);
                
            }
            st.push(i); //storing index
            
        }
        return max;
    }
}