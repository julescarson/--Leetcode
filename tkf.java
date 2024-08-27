import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class tkf {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> dict = new HashMap<>();
        for (int e : nums) {
            if (!dict.containsKey(e)) {
                dict.put(e, 1);
            } else if (dict.containsKey(e)) {
                dict.replace(e, dict.get(e) + 1);
            }
        }
        ArrayList<Integer> l = new ArrayList<>(dict.values());
        Collections.sort(l, Collections.reverseOrder());
        ArrayList<Integer> l2 = new ArrayList<>(l.subList(0, k));
        int[] ans = new int[k];
        int i = 0;

        for (HashMap.Entry<Integer, Integer> el : dict.entrySet()) {
            if (l2.contains(el.getValue())) {
                ans[i] = el.getKey();
                i++;
            }
        }

        return ans;

    }
}
