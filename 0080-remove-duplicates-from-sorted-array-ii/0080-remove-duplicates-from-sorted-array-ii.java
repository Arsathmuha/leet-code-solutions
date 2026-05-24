class Solution {

    public int removeDuplicates(int[] nums) {

        // arrays of size <= 2 are already valid
        if (nums.length <= 2) {
            return nums.length;
        }

        int index = 2;

        for (int i = 2; i < nums.length; i++) {

            // keep element if different from
            // element two positions before
            if (nums[i] != nums[index - 2]) {

                nums[index] = nums[i];

                index++;
            }
        }

        return index;
    }
}