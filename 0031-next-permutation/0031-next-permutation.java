class Solution {

    public void nextPermutation(int[] nums) {

        int n = nums.length;

        int i = n - 2;

        // find first decreasing element
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // if found
        if (i >= 0) {

            int j = n - 1;

            // find next greater element
            while (nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);
        }

        // reverse remaining part
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {

        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int left, int right) {

        while (left < right) {

            swap(nums, left, right);

            left++;
            right--;
        }
    }
}