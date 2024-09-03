import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int[] ans = new int[temperatures.length];

        for (int i = temperatures.length - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                st.push(i);
                ans[i] = 0;
            } else {
                while (!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
                    st.pop();
                }
            }
        }

        return ans;

    }
}