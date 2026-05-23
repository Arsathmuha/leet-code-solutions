import java.util.*;

class Solution {

    public List<List<String>> solveNQueens(int n) {

        List<List<String>> result = new ArrayList<>();

        char[][] board = new char[n][n];

        // initialize board
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        Set<Integer> cols = new HashSet<>();
        Set<Integer> diagonals = new HashSet<>();
        Set<Integer> antiDiagonals = new HashSet<>();

        backtrack(0, n, board,
                  cols,
                  diagonals,
                  antiDiagonals,
                  result);

        return result;
    }

    private void backtrack(int row,
                           int n,
                           char[][] board,
                           Set<Integer> cols,
                           Set<Integer> diagonals,
                           Set<Integer> antiDiagonals,
                           List<List<String>> result) {

        // all queens placed
        if (row == n) {

            List<String> current = new ArrayList<>();

            for (char[] r : board) {
                current.add(new String(r));
            }

            result.add(current);

            return;
        }

        for (int col = 0; col < n; col++) {

            int diagonal = row - col;
            int antiDiagonal = row + col;

            // unsafe position
            if (cols.contains(col)
                || diagonals.contains(diagonal)
                || antiDiagonals.contains(antiDiagonal)) {

                continue;
            }

            // place queen
            board[row][col] = 'Q';

            cols.add(col);
            diagonals.add(diagonal);
            antiDiagonals.add(antiDiagonal);

            backtrack(row + 1,
                      n,
                      board,
                      cols,
                      diagonals,
                      antiDiagonals,
                      result);

            // remove queen (backtrack)
            board[row][col] = '.';

            cols.remove(col);
            diagonals.remove(diagonal);
            antiDiagonals.remove(antiDiagonal);
        }
    }
}