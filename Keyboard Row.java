class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";

        List<String> list = new ArrayList<>();

        for (String word : words) {
            String row;

            char ch = word.charAt(0);

            if (row1.indexOf(ch) != -1)
                row = row1;
            else if (row2.indexOf(ch) != -1)
                row = row2;
            else
                row = row3;

            boolean valid = true;

            for (char c : word.toCharArray()) {
                if (row.indexOf(c) == -1) {
                    valid = false;
                    break;
                }
            }

            if (valid)
                list.add(word);
        }

        return list.toArray(new String[0]);
    }
}
