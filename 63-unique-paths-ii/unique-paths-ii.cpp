class Solution {
public:
    int uniquePathsWithObstacles(vector<vector<int>>& obstacleGrid) {
        int m = obstacleGrid.size();
        int n = obstacleGrid[0].size();

        // starting ending blocked ...
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m-1][n-1] == 1)
            return 0;

        vector<vector<long long>> dp(m, vector<long long>(n, 0));

        dp[0][0] = 1; //Starting and ending

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (obstacleGrid[i][j] == 1) {
                    dp[i][j] = 0; //blocked area
                    continue;
                }

                if (i > 0)
                    dp[i][j] += dp[i-1][j]; //From top

                if (j > 0)
                    dp[i][j] += dp[i][j-1]; // from left
            }
        }

        return dp[m-1][n-1];
    }
};
