class Solution {

    boolean graphColoring(int[][] edges, int m, int n) {
        int[] colors = new int[n];

        return solve(0, edges, colors, m, n);
    }

    private boolean solve(int node, int[][] edges, int[] colors, int m, int n) {
        if (node == n) {
            return true;
        }

        for (int color = 1; color <= m; color++) {
            if (isSafe(node, color, edges, colors, n)) {
                colors[node] = color;

                if (solve(node + 1, edges, colors, m, n)) {
                    return true;
                }

                colors[node] = 0;
            }
        }

        return false;
    }

    private boolean isSafe(int node, int color, int[][] edges,
                           int[] colors, int n) {
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            if (u == node && colors[v] == color) {
                return false;
            }

            if (v == node && colors[u] == color) {
                return false;
            }
        }

        return true;
    }
}
