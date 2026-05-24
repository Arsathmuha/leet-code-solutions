class Solution {

    public int[][] generateMatrix(int n) {

        int[][] matrix = new int[n][n];

        int top = 0;
        int bottom = n - 1;

        int left = 0;
        int right = n - 1;

        int number = 1;

        while (top <= bottom && left <= right) {

            // left -> right
            for (int col = left; col <= right; col++) {
                matrix[top][col] = number++;
            }

            top++;

            // top -> bottom
            for (int row = top; row <= bottom; row++) {
                matrix[row][right] = number++;
            }

            right--;

            // right -> left
            for (int col = right; col >= left; col--) {
                matrix[bottom][col] = number++;
            }

            bottom--;

            // bottom -> top
            for (int row = bottom; row >= top; row--) {
                matrix[row][left] = number++;
            }

            left++;
        }

        return matrix;
    }
}