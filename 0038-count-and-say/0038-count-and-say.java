class Solution {

    public String countAndSay(int n) {

        String result = "1";

        for (int i = 2; i <= n; i++) {

            StringBuilder current = new StringBuilder();

            int count = 1;

            for (int j = 1; j <= result.length(); j++) {

                // same character
                if (j < result.length() &&
                    result.charAt(j) == result.charAt(j - 1)) {

                    count++;
                }
                else {

                    current.append(count);
                    current.append(result.charAt(j - 1));

                    count = 1;
                }
            }

            result = current.toString();
        }

        return result;
    }
}