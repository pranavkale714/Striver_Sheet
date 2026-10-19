import java.util.*;

class Solution {

    public List<String> findPath(int[][] grid) {
        List<String> ans = new ArrayList<>();
        int n = grid.length;

        if (n == 0 || grid[0][0] == 0) {
            return ans;
        }

        boolean[][] visited = new boolean[n][n];

        solve(0, 0, grid, n, visited, "", ans);

        Collections.sort(ans);
        return ans;
    }

    private void solve(int row, int col, int[][] grid, int n,
                       boolean[][] visited, String path,
                       List<String> ans) {

        if (row == n - 1 && col == n - 1) {
            ans.add(path);
            return;
        }

        visited[row][col] = true;

        // Down
        if (row + 1 < n && grid[row + 1][col] == 1
                && !visited[row + 1][col]) {
            solve(row + 1, col, grid, n, visited, path + "D", ans);
        }

        // Left
        if (col - 1 >= 0 && grid[row][col - 1] == 1
                && !visited[row][col - 1]) {
            solve(row, col - 1, grid, n, visited, path + "L", ans);
        }

        // Right
        if (col + 1 < n && grid[row][col + 1] == 1
                && !visited[row][col + 1]) {
            solve(row, col + 1, grid, n, visited, path + "R", ans);
        }

        // Up
        if (row - 1 >= 0 && grid[row - 1][col] == 1
                && !visited[row - 1][col]) {
            solve(row - 1, col, grid, n, visited, path + "U", ans);
        }

        visited[row][col] = false;
    }
}
