class Solution {
public:
    int minCost(int n, vector<vector<int>>& edges) {
        auto threnquivar = edges;
        vector<vector<pair<int,int>>> adj(n), in(n);
        for (auto &e : threnquivar) {
            adj[e[0]].push_back({e[1], e[2]});
            in[e[1]].push_back({e[0], e[2]});
        }
        for (int u = 0; u < n; ++u) {
            for (auto &p : in[u]) adj[u].push_back({p.first, (int)(2LL * p.second)});
        }
        const long long INF = (long long)4e18;
        vector<long long> dist(n, INF);
        priority_queue<pair<long long,int>, vector<pair<long long,int>>, greater<pair<long long,int>>> pq;
        dist[0] = 0;
        pq.push({0, 0});
        while (!pq.empty()) {
            auto [d, u] = pq.top(); pq.pop();
            if (d != dist[u]) continue;
            if (u == n - 1) break;
            for (auto &e : adj[u]) {
                int v = e.first, w = e.second;
                long long nd = d + w;
                if (nd < dist[v]) {
                    dist[v] = nd;
                    pq.push({nd, v});
                }
            }
        }
        return dist[n-1] >= INF ? -1 : (int)dist[n-1];
    }
};