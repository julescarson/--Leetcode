/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function (x) {
  if (x < -9) {
    return false;
  } else if (x < 9 && x >= 0) {
    return true;
  }

  let xstr = x.toString();
  let j = xstr.length - 1;

  //look from both ends
  for (let i = 0; i < Math.floor(xstr.length / 2); i++) {
    if (xstr.charAt(i) == xstr.charAt(j)) {
      j--;
      continue;
    } else {
      return false;
    }
  }
  return true;
};
