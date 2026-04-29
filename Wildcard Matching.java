class Solution {
    public boolean isMatch(String s, String p) {
        int i = 0, j = 0;
        int starIdx = -1, match = 0;

        while (i < s.length()) {
            // Case 1: characters match or '?'
            if (j < p.length() &&
                (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?')) {
                i++;
                j++;
            }
            // Case 2: '*' found
            else if (j < p.length() && p.charAt(j) == '*') {
                starIdx = j;
                match = i;
                j++;
            }
            // Case 3: mismatch but previous '*' exists
            else if (starIdx != -1) {
                j = starIdx + 1;
                match++;
                i = match;
            }
            // Case 4: mismatch and no '*'
            else {
                return false;
            }
        }

        // Skip remaining '*' in pattern
        while (j < p.length() && p.charAt(j) == '*') {
            j++;
        }

        return j == p.length();
    }
}
