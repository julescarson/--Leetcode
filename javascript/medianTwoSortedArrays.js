/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */

var findMedianSortedArrays = function (nums1, nums2) {
  let n3 = nums1.concat(nums2);
  //custom comparator since negative values not treated properly
  n3.sort((a, b) => a - b);
  if (n3.length % 2 != 0) {
    return n3[Math.floor(n3.length / 2)];
  } else {
    //find avg med 2
    let ans = n3[Math.floor(n3.length / 2) - 1] + n3[Math.floor(n3.length / 2)];
    return ans / 2;
  }
};
