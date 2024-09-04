class Solution(object):
    def isPalindrome(self, x):
        if (x < -9): return False
        if (x < 9 and x > 0): return True

        xstr = str(x)
        j = len(xstr)-1

        #floor div
        for i in range(0, len(xstr)//2) :
            if (xstr[i] == xstr[j]) :
                j -= 1
                continue
            else :
                return False
            
        return True
        