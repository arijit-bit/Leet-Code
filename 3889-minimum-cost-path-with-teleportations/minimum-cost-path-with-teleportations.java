import java.util.*;

class Solution {

    static class State {
        int x, y, t, cost;
        State(int x, int y, int t, int cost) {
            this.x = x;
            this.y = y;
            this.t = t;
            this.cost = cost;
        }
    }

    public int minCost(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        int INF = Integer.MAX_VALUE;

        int[][][] dist = new int[m][n][k + 1];
        for (int[][] layer : dist)
            for (int[] row : layer)
                Arrays.fill(row, INF);

        // all cells sorted by value
        List<int[]> cells = new ArrayList<>();
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                cells.add(new int[]{grid[i][j], i, j});

        cells.sort(Comparator.comparingInt(a -> a[0]));

        // for each teleport count, track processed teleport cells
        boolean[][][] usedTeleport = new boolean[k + 1][m][n];
        int[] ptr = new int[k + 1]; // pointer in sorted cells

        PriorityQueue<State> pq =
            new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));

        pq.offer(new State(0, 0, 0, 0));
        dist[0][0][0] = 0;

        int[] dx = {1, 0};
        int[] dy = {0, 1};

        while (!pq.isEmpty()) {
            State cur = pq.poll();
            int x = cur.x, y = cur.y, t = cur.t, cost = cur.cost;

            if (cost > dist[x][y][t]) continue;

            if (x == m - 1 && y == n - 1) {
                return cost;
            }

            // normal moves
            for (int d = 0; d < 2; d++) {
                int nx = x + dx[d];
                int ny = y + dy[d];
                if (nx < m && ny < n) {
                    int nc = cost + grid[nx][ny];
                    if (nc < dist[nx][ny][t]) {
                        dist[nx][ny][t] = nc;
                        pq.offer(new State(nx, ny, t, nc));
                    }
                }
            }

            // optimized teleport
            if (t < k) {
                while (ptr[t] < cells.size() &&
                       cells.get(ptr[t])[0] <= grid[x][y]) {

                    int[] c = cells.get(ptr[t]);
                    int nx = c[1], ny = c[2];

                    if (!usedTeleport[t][nx][ny]) {
                        usedTeleport[t][nx][ny] = true;
                        if (cost < dist[nx][ny][t + 1]) {
                            dist[nx][ny][t + 1] = cost;
                            pq.offer(new State(nx, ny, t + 1, cost));
                        }
                    }
                    ptr[t]++;
                }
            }
        }

        return -1;
    }
}
