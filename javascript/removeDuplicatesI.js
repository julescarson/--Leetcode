/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
  let count = 1;
  let totalDuplicates = 0;
  let prev = nums[0];

  //start from second index
  for (let i = 1; i < nums.length; i++) {
    if (nums[i] == prev) {
      count++;
    } else {
      prev = nums[i];
      count = 1;
    }
    if (count >= 3) {
      nums[i] = Infinity; // will push to end in sort
      totalDuplicates++;
    }
  }
  //custom comparator for -'ve values
  nums.sort((a, b) => a - b);
  return nums.length - totalDuplicates;
};
