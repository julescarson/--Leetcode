
class Solution {
    public int buyChoco(int[] prices, int money) {
        int c = money;
        int change = money;

        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices.length; j++) {
                int sum = prices[i] + prices[j];
                if (sum > money) {
                    continue;
                }
                if (sum <= c && j != i) {
                    c = sum;
                    change = money - c;
                }
            }
        }
        return change;
    }
}
