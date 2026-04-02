class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        backtrack(s, 0, 0, new StringBuilder(), res);
        return res;
    }

    private void backtrack(String s, int idx, int parts, StringBuilder path, List<String> res) {
        if (parts == 4 && idx == s.length()) {
            res.add(path.substring(0, path.length() - 1));
            return;
        }
        if (parts == 4 || idx == s.length()) return;

        for (int len = 1; len <= 3 && idx + len <= s.length(); len++) {
            String part = s.substring(idx, idx + len);
            if ((part.startsWith("0") && part.length() > 1) || Integer.parseInt(part) > 255) continue;

            int before = path.length();
            path.append(part).append('.');
            backtrack(s, idx + len, parts + 1, path, res);
            path.setLength(before);
        }
    }
}

