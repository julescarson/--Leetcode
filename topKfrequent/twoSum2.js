/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (numbers, target) {
  for (i = 0; i < numbers.length; i++) {
    for (j = 0; j < numbers.length; j++) {
      if (j != i) {
        console.log(`${j}, ${i}`);
      }
    }
  }
};

numbers = [2, 7, 11, 15];
target = 9;

twoSum(numbers, target);
