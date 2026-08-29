class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        int [][] temp = new int [m][n];
        int tempRow = 0;
        int tempCol = 0;

        for(int i=0; i<n; i++){ //column
            for(int j=m-1; j>=0; j--){ //row
                temp[tempRow][tempCol++] = matrix[j][i];
            }
            tempRow++;
            tempCol = 0;
        }
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = temp[i][j];
            }
        }
    }
}