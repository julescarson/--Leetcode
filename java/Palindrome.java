import java.util.Arrays;

class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        System.out.println(s);

        char[] ch = s.toUpperCase().replaceAll("[-+.^:,\\s+]", "").toCharArray();
        System.out.println(Arrays.toString(ch));
        int n = ch.length - 1;
        for (int i = 0; i < (ch.length / 2); i++) {
            if (ch[i] != ch[n]) {
                return false;
            }
            n--;
        }
        return true;
    }
}