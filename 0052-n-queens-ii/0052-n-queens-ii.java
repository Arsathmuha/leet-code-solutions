import java.util.*;

class Solution {

    int count = 0;

    public int totalNQueens(int n) {

        Set<Integer> cols = new HashSet<>();
        Set<Integer> diagonals = new HashSet<>();
        Set<Integer> antiDiagonals = new HashSet<>();

        backtrack(0,
                  n,
                  cols,
                  diagonals,
                  antiDiagonals);

        return count;
    }

    private void backtrack(int row,
                           int n,
                           Set<Integer> cols,
                           Set<Integer> diagonals,
                           Set<Integer> antiDiagonals) {

        // valid arrangement found
        if (row == n) {

            count++;

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
            cols.add(col);
            diagonals.add(diagonal);
            antiDiagonals.add(antiDiagonal);

            backtrack(row + 1,
                      n,
                      cols,
                      diagonals,
                      antiDiagonals);

            // backtrack
            cols.remove(col);
            diagonals.remove(diagonal);
            antiDiagonals.remove(antiDiagonal);
        }
    }
}