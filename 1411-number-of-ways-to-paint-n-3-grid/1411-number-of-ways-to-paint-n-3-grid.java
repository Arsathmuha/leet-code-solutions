class Solution {

    public int numOfWays(int n) {

        long MOD = 1_000_000_007;

        long twoColor = 6;
        long threeColor = 6;

        for (int i = 2; i <= n; i++) {

            long newTwoColor = (2 * twoColor + 2 * threeColor) % MOD;

            long newThreeColor = (2 * twoColor + 3 * threeColor) % MOD;

            twoColor = newTwoColor;
            threeColor = newThreeColor;
        }

        return (int)((twoColor + threeColor) % MOD);
    }
}