class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int top = 0;
        int right = n-1;
        int bottom = m-1;
        List<Integer> ans = new ArrayList<>();

        while(left <= right && top<=bottom){
            for(int i = left; i <= right; i++){
            ans.add(matrix[top][i]);
            }
            top++;
            for(int i=top; i<=bottom; i++){
                ans.add(matrix[i][right]);
            }
            right--;
            if(top <= bottom){ // imagine an array with one row without this it will print the same row twice right to left
                for(int i = right; i >= left; i--){
                    ans.add(matrix[bottom][i]);
                }
            }
            
            bottom--;
            if(left<=right){ // if only column like [[1],[5],[9]] to make sure repeat it twice like [1,5,9,5] this if we dont use it,  ans- [1,5,9]
                for(int i=bottom; i>=top; i--){
                    ans.add(matrix[i][left]);
                }
            }
            left++;
        }
        return ans;

    }
}