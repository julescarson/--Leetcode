/**
 * @param {number[]} prices
 * @return {number}
 */

var maxProfit = function (prices) {
  //req at least 2 values
  if (prices.length <= 1) {
    return 0;
  }

  //remove smaller end values
  while (prices[prices.length - 1] < prices[prices.length - 2]) {
    prices.pop();
  }

  //track
  let min = prices[0];
  let max = 0;

  //loop through, update initial value or check if new maximum found
  for (let i = 0; i < prices.length; i++) {
    if (prices[i] < min) {
      min = prices[i];
    } else if (prices[i] - min > max) {
      max = prices[i] - min;
    }
  }

  return max;
};
