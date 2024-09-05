/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function (nums1, m, nums2, n) {
  let k = nums1.length - 1;
  let p1 = m - 1;
  let p2 = n - 1;

  //still have elements from p2
  while (p2 >= 0) {
    //still have elements in both, then compare
    if (p1 >= 0 && nums1[p1] > nums2[p2]) {
      nums1[k] = nums1[p1];
      k--;
      p1--;
      //only have p2 left to input in nums1
    } else {
      nums1[k] = nums2[p2];
      k--;
      p2--;
    }
  }
};
