import java.util.HashMap;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class gans {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> r = new HashMap<>();
        for (String string : strs) {

            char[] chars = string.toCharArray(); // create char array for each string
            Arrays.sort(chars); // sort the char array (*anagrams will be same..)
            String sorted = new String(chars); // turn it back into a string, after sorting

            // check the dictionary to see if sorted string is there
            if (!r.containsKey(sorted)) {
                // if not there, then add it, and a new array list for values
                ArrayList<String> l = new ArrayList<>();
                r.put(sorted, l);
            }
            // based on this new key, add the original string into the values
            r.get(sorted).add(string);
        }

        // create our return list
        // parameter for the list are the values in dic
        // these values are themselves the grouped arrays
        List<List<String>> ans = new ArrayList<>(r.values()); // can also declare as var

        return ans;
    }

    public static void main(String[] args) {
        // TEST CASES:

    }
}
