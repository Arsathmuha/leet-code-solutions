import java.util.Arrays;

class Solution {
    public int minimumEffort(int[][] tasks) {

        Arrays.sort(tasks, (a, b) ->
            (b[1] - b[0]) - (a[1] - a[0])
        );

        int energy = 0;
        int current = 0;

        for (int[] task : tasks) {

            int actual = task[0];
            int minimum = task[1];

            // increase energy if current energy is not enough
            if (current < minimum) {
                energy += (minimum - current);
                current = minimum;
            }

            // complete task
            current -= actual;
        }

        return energy;
    }
}