class Solution {
    public int numIslands(char[][] grid) {
        //interate the matrix if 1 (land found)

        int count = 0;

        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    DFS(grid, i, j);
                }
            }
        }

        return count;
    }
    // we will do DFS search all direction left, right, bottom, top;
    // return if water (0), if visited than convert 1 -> 0; 
    
    protected void DFS(char[][] grid, int r, int c){
        //base case out of bound
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[0].length){
            return;
        }
        //if water return
        if(grid[r][c] == '0') return;

        //mark vistied 
        if(grid[r][c] == '1') grid[r][c] = '0';

        //top
        DFS(grid , r-1, c);
        //bottom
        DFS(grid , r+1, c);
        //left
        DFS(grid , r, c-1);
        //right
        DFS(grid , r, c+1);

    }

}