
import java.util.Arrays;

public class isanagram242 {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] schars = s.toCharArray();
        char[] tchars = t.toCharArray();
        Arrays.sort(schars);
        Arrays.sort(tchars);
        if (Arrays.equals(schars, tchars)) {
            return true;
        }
        return false;
    }

}
