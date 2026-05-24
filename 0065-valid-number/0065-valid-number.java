class Solution {

    public boolean isNumber(String s) {

        boolean seenDigit = false;
        boolean seenDot = false;
        boolean seenExponent = false;

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // digit
            if (Character.isDigit(ch)) {

                seenDigit = true;
            }

            // sign
            else if (ch == '+' || ch == '-') {

                // must be at start or after e/E
                if (i > 0 &&
                    s.charAt(i - 1) != 'e' &&
                    s.charAt(i - 1) != 'E') {

                    return false;
                }
            }

            // decimal point
            else if (ch == '.') {

                // only one dot and not after exponent
                if (seenDot || seenExponent) {
                    return false;
                }

                seenDot = true;
            }

            // exponent
            else if (ch == 'e' || ch == 'E') {

                // only one exponent
                // must have digit before exponent
                if (seenExponent || !seenDigit) {
                    return false;
                }

                seenExponent = true;

                // need digit after exponent
                seenDigit = false;
            }

            // invalid character
            else {

                return false;
            }
        }

        return seenDigit;
    }
}