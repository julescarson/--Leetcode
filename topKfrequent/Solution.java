import java.util.Arrays;
import java.util.HashSet;

class Solution {
    public static int[] topKFrequent(int[] nums, int k) {
        // k is how many, not the valueitself
        HashSet<Integer> uniqueValues = new HashSet<>();
        for (Integer v : nums) {
            uniqueValues.add(v);
        }
        int[] ans = new int[k];
        int i = 0;
        for (int el : uniqueValues) {
            if (i < k) {
                ans[i] = el;
            }
            i++;
        }

        Arrays.sort(ans);

        return ans;
    }

    public static void main(String[] args) {
        int[] x = { 5, 43, 2, 1, 2, 3, 4, 5, 5 };
        topKFrequent(x, 100000);
        System.out.println(Arrays.toString(topKFrequent(x, 100000)));
    }

}