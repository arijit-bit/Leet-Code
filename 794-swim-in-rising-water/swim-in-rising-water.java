class Solution {
    public int swimInWater(int[][] grid) {
        int n = grid.length;
        boolean[][] visited = new boolean[n][n];

        
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        pq.offer(new int[]{grid[0][0], 0, 0});

        int maxElevation = 0;
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

        while (!pq.isEmpty()) {
            int[] cell = pq.poll();
            int elev = cell[0], x = cell[1], y = cell[2];

            if (visited[x][y]) continue;
            visited[x][y] = true;

            maxElevation = Math.max(maxElevation, elev);
            if (x == n - 1 && y == n - 1) return maxElevation;

            for (int[] d : directions) {
                int nx = x + d[0], ny = y + d[1];
                if (nx >= 0 && ny >= 0 && nx < n && ny < n && !visited[nx][ny]) {
                    pq.offer(new int[]{grid[nx][ny], nx, ny});
                }
            }
        }
        return maxElevation;
    }
}