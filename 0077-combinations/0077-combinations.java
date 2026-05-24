import java.util.*;

class Solution {

    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(1,
                  n,
                  k,
                  new ArrayList<>(),
                  result);

        return result;
    }

    private void backtrack(int start,
                           int n,
                           int k,
                           List<Integer> current,
                           List<List<Integer>> result) {

        // valid combination
        if (current.size() == k) {

            result.add(new ArrayList<>(current));

            return;
        }

        for (int num = start; num <= n; num++) {

            current.add(num);

            backtrack(num + 1,
                      n,
                      k,
                      current,
                      result);

            // backtrack
            current.remove(current.size() - 1);
        }
    }
}