import java.util.*;

class Solution {

    public boolean isValidSudoku(char[][] board) {

        HashSet<String> seen = new HashSet<>();

        for (int row = 0; row < 9; row++) {

            for (int col = 0; col < 9; col++) {

                char current = board[row][col];

                if (current == '.') {
                    continue;
                }

                // unique keys
                String rowKey = current + " in row " + row;
                String colKey = current + " in col " + col;

                int box = (row / 3) * 3 + (col / 3);

                String boxKey = current + " in box " + box;

                // duplicate found
                if (!seen.add(rowKey) ||
                    !seen.add(colKey) ||
                    !seen.add(boxKey)) {

                    return false;
                }
            }
        }

        return true;
    }
}