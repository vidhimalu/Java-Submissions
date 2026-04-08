class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++;
            right--;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        char[] s = {'h', 'e', 'l', 'l', 'o'};
        sol.reverseString(s);

        System.out.println(s); 
    }
}
