import java.util.*;

class Solution {

    public List<String> fullJustify(String[] words,
                                    int maxWidth) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < words.length) {

            int lineLength = words[i].length();

            int j = i + 1;

            // fit maximum words
            while (j < words.length &&
                   lineLength + 1 + words[j].length()
                           <= maxWidth) {

                lineLength += 1 + words[j].length();

                j++;
            }

            int numberOfWords = j - i;

            int totalChars = 0;

            for (int k = i; k < j; k++) {
                totalChars += words[k].length();
            }

            int totalSpaces = maxWidth - totalChars;

            StringBuilder line = new StringBuilder();

            // last line or single word
            if (j == words.length || numberOfWords == 1) {

                for (int k = i; k < j; k++) {

                    line.append(words[k]);

                    if (k != j - 1) {
                        line.append(" ");
                    }
                }

                // remaining spaces
                while (line.length() < maxWidth) {
                    line.append(" ");
                }
            }

            // fully justified
            else {

                int gaps = numberOfWords - 1;

                int spaces = totalSpaces / gaps;

                int extraSpaces = totalSpaces % gaps;

                for (int k = i; k < j; k++) {

                    line.append(words[k]);

                    if (k != j - 1) {

                        int currentSpaces = spaces;

                        // left gaps get extra spaces
                        if (extraSpaces > 0) {

                            currentSpaces++;

                            extraSpaces--;
                        }

                        for (int s = 0;
                             s < currentSpaces;
                             s++) {

                            line.append(" ");
                        }
                    }
                }
            }

            result.add(line.toString());

            i = j;
        }

        return result;
    }
}