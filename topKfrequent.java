import java.util.HashSet;
import java.util.ArrayList;

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashSet<Integer> uniqueValues = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for (Integer el : nums) {
            if (el <= k) {
                uniqueValues.add(el);
            }
        }
        for (Integer el : uniqueValues) {
            if (el <= k) {
                ans.push(el);
            }
        }
        int[] x = new int[uniqueValues.size()];
        for (int i = 0; i < ans.length; i++) {
            x[i] = ans[i];
        }

        return x;

    }

    public static void main(String[] args) {
        // -- TESTER --
        int[] a = { 1, 1, 1, 2, 2, 3 };
        int[] b = { 1 };

        System.out.println(topKFrequent(a));
    }

}