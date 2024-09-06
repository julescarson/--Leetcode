/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
  let k = 0;
  nums.length > 0
    ? (k = 1)
    : () => {
        return k;
      }; //hehe, the ugliest return inside ternary

  //unique elements k
  for (let i = 1; i < nums.length; i++) {
    //nums[i] not same as previous then update earlier k'th value
    if (nums[i] != nums[k - 1]) {
      nums[k] = nums[i];
      k++;
    }
  }

  // console.log(nums);

  return k;
};
