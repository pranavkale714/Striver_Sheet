import java.util.*;

class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();

        char[][] board = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        boolean[] cols = new boolean[n];
        boolean[] diagonals = new boolean[2 * n - 1];
        boolean[] antiDiagonals = new boolean[2 * n - 1];

        solve(0, n, board, cols, diagonals, antiDiagonals, ans);

        return ans;
    }

    private void solve(int row, int n, char[][] board,
                       boolean[] cols, boolean[] diagonals,
                       boolean[] antiDiagonals,
                       List<List<String>> ans) {

        if (row == n) {
            List<String> result = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                result.add(new String(board[i]));
            }

            ans.add(result);
            return;
        }

        for (int col = 0; col < n; col++) {
            int diagonal = row - col + n - 1;
            int antiDiagonal = row + col;

            if (cols[col] || diagonals[diagonal]
                    || antiDiagonals[antiDiagonal]) {
                continue;
            }

            board[row][col] = 'Q';
            cols[col] = true;
            diagonals[diagonal] = true;
            antiDiagonals[antiDiagonal] = true;

            solve(row + 1, n, board, cols, diagonals,
                  antiDiagonals, ans);

            board[row][col] = '.';
            cols[col] = false;
            diagonals[diagonal] = false;
            antiDiagonals[antiDiagonal] = false;
        }
    }
}
