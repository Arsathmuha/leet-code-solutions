import java.util.*;

class Solution {

    public int longestCommonPrefix(int[] arr1, int[] arr2) {

        HashSet<Integer> set = new HashSet<>();

        // store all prefixes of arr1 numbers
        for (int num : arr1) {

            while (num > 0) {
                set.add(num);
                num /= 10;
            }
        }

        int maxLen = 0;

        // check prefixes in arr2
        for (int num : arr2) {

            int temp = num;

            while (temp > 0) {

                if (set.contains(temp)) {
                    maxLen = Math.max(maxLen,
                            String.valueOf(temp).length());
                    break;
                }

                temp /= 10;
            }
        }

        return maxLen;
    }
}