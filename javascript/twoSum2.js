/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (numbers, target) {
  let uniqueVals = Array.from(new Set(numbers)); //unique values
  let uvRemainder = uniqueVals.map((e) => target - e); //target - unique value
  let actuals = uniqueVals.filter((e) => uvRemainder.includes(e)); //the actual values for the index we need to find (intersection of 2 prev)
  actuals = [actuals[0], actuals[actuals.length - 1]];
  let xy = [firstOccurenceIdx(actuals[0], numbers) + 1];

  if (actuals[0] == actuals[1]) {
    xy.push(xy[0] + 2);
    return xy;
  } else {
    xy.push(firstOccurenceIdx(actuals[1], numbers) + 1);
    return xy;
  }
};

//using ~binary search and finding first index
function firstOccurenceIdx(num, arr) {
  let left = 0;
  let right = arr.length - 1;
  let result;

  while (left <= right) {
    let mid = Math.floor((left + right) / 2);
    if (arr[mid] == num) {
      result = mid;
      right = mid - 1;
    } else if (arr[mid] < num) {
      // go left
      left = mid + 1;
    } else {
      //go right
      right = mid - 1;
    }
  }
  return result;
}
