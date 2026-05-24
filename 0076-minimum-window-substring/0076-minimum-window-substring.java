class Solution {

    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        int[] need = new int[128];

        for (char ch : t.toCharArray()) {
            need[ch]++;
        }

        int left = 0;

        int required = t.length();

        int minLength = Integer.MAX_VALUE;

        int start = 0;

        for (int right = 0; right < s.length(); right++) {

            char rightChar = s.charAt(right);

            // useful character
            if (need[rightChar] > 0) {
                required--;
            }

            need[rightChar]--;

            // valid window
            while (required == 0) {

                // update answer
                if (right - left + 1 < minLength) {

                    minLength = right - left + 1;

                    start = left;
                }

                char leftChar = s.charAt(left);

                need[leftChar]++;

                // window becomes invalid
                if (need[leftChar] > 0) {
                    required++;
                }

                left++;
            }
        }

        return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(start,
                              start + minLength);
    }
}