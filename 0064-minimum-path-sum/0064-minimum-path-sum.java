class Solution {

    public int minPathSum(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[][] dp = new int[m][n];

        dp[0][0] = grid[0][0];

        // first row
        for (int col = 1; col < n; col++) {

            dp[0][col] =
                    dp[0][col - 1] + grid[0][col];
        }

        // first column
        for (int row = 1; row < m; row++) {

            dp[row][0] =
                    dp[row - 1][0] + grid[row][0];
        }

        // remaining cells
        for (int row = 1; row < m; row++) {

            for (int col = 1; col < n; col++) {

                dp[row][col] =
                        grid[row][col]
                      + Math.min(dp[row - 1][col],
                                 dp[row][col - 1]);
            }
        }

        return dp[m - 1][n - 1];
    }
}