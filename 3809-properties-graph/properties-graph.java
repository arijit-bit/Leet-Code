class Solution {
    public int numberOfComponents(int[][] properties, int k) {
        int n = properties.length;
        List<Set<Integer>> sets = new ArrayList<>();

        
        for (int[] row : properties) {
            Set<Integer> s = new HashSet<>();
            for (int val : row) s.add(val);
            sets.add(s);
        }

        
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) graph.add(new ArrayList<>());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (intersectCount(sets.get(i), sets.get(j)) >= k) {
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }
            }
        }

        
        boolean[] visited = new boolean[n];
        int components = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                components++;
                dfs(i, graph, visited);
            }
        }
        return components;
    }

    private int intersectCount(Set<Integer> a, Set<Integer> b) {
        int count = 0;
        for (int val : a) {
            if (b.contains(val)) count++;
        }
        return count;
    }

    private void dfs(int node, List<List<Integer>> graph, boolean[] visited) {
        visited[node] = true;
        for (int nei : graph.get(node)) {
            if (!visited[nei]) dfs(nei, graph, visited);
        }
    }
}