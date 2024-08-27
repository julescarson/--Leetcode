import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

/*
 Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

 */

public class ganagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> resultMap = new HashMap<>();
       
       
        for (String string : strs) {
            /// sorted char array
            char[] chars = string.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);
            if (!resultMap.containsKey(sorted)) {
                ArrayList<String> l = new ArrayList<>();
                resultMap.put(sorted, l);
            }
            resultMap.get(sorted).add(string);
        }

        var r = new ArrayList<>(resultMap.values());

        return r;

    }
}
