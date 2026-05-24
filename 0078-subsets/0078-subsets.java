import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        backtrack(0,
                  nums,
                  new ArrayList<>(),
                  result);

        return result;
    }

    private void backtrack(int index,
                           int[] nums,
                           List<Integer> current,
                           List<List<Integer>> result) {

        // add current subset
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {

            // choose element
            current.add(nums[i]);

            backtrack(i + 1,
                      nums,
                      current,
                      result);

            // backtrack
            current.remove(current.size() - 1);
        }
    }
}