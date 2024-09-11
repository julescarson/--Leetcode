/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */

var merge = function (intervals) {
  let ans = [];
  //sort on first element for compares
  intervals.sort((a, b) => a[0] - b[0]);

  for (let i = 0; i < intervals.length - 1; i++) {
    // b1 in range of a, a2 in range of b : [a1,a2], [b1,b2]
    let a1 = intervals[i][0];
    let a2 = intervals[i][1];
    let b1 = intervals[i + 1][0];
    let b2 = intervals[i + 1][1];

    //update values
    if ((a2 >= b1 && a1 <= b2) || (b1 <= a1 && b2 >= a1)) {
      intervals[i + 1] = [
        Math.min(intervals[i][0], intervals[i + 1][0]),
        Math.max(intervals[i + 1][1], intervals[i][1]),
      ];
      intervals[i] = [];
      update = true;
      //update ans
    } else {
      ans.push(intervals[i]);
    }
  }
  //last element has final intervals
  ans.push(intervals[intervals.length - 1]);

  return ans;
};
