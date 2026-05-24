import java.util.*;

class Solution {

    public String getPermutation(int n, int k) {

        List<Integer> numbers = new ArrayList<>();

        int factorial = 1;

        // prepare numbers and factorial
        for (int i = 1; i < n; i++) {

            factorial *= i;

            numbers.add(i);
        }

        numbers.add(n);

        // convert to 0-based index
        k--;

        StringBuilder result = new StringBuilder();

        while (true) {

            int index = k / factorial;

            result.append(numbers.get(index));

            numbers.remove(index);

            // finished
            if (numbers.isEmpty()) {
                break;
            }

            k %= factorial;

            factorial /= numbers.size();
        }

        return result.toString();
    }
}