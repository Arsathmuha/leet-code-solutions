class Solution {
    public int[] rearrangeArray(int[] nums) {
        int numsLength = nums.length;
        int[] finalAns = new int[numsLength];
        int[] posArray = new int[numsLength / 2];
        int[] negArray = new int[numsLength / 2];

        int indexPos = 0, indexNeg = 0;
        for (int i = 0; i < numsLength; i++) {
            if (nums[i] > 0) {
                posArray[indexPos++] = nums[i];
            } else {
                negArray[indexNeg++] = nums[i];
            }
        }

        int index = 0;
        for (int i = 0; i < numsLength; i += 2) {
            finalAns[i] = posArray[index];
            finalAns[i + 1] = negArray[index];
            index++;
        }

        return finalAns;
    }
}