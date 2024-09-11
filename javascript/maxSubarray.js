/**
 * @param {number[]} nums
 * @return {number}
 */
function arrReduce(arr) {
  return arr.reduce((acc, curr) => acc + curr, 0);
}

var maxSubArray = function (nums) {
  if (nums.length == 1) {
    return nums[0];
  }
  let max = -Infinity;
  let currMax = 0;

  //currMax update when num is > previous subarray maximum
  nums.forEach((e) => {
    currMax = Math.max(currMax + e, e);
    max = Math.max(currMax, max);
  });
  return max;
};
