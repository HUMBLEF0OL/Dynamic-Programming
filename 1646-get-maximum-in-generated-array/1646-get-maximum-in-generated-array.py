class Solution:
    def getMaximumGenerated(self, n: int) -> int:
        if n<=1:
            return n;
        nums = [0]*(n+1)
        nums[0] = 0
        nums[1] = 1
        maxNumber = 1;
        i = 1;
        while (2*i+1 <= n):
            nums[2*i] = nums[i]
            nums[2*i+1] = nums[i]+nums[i+1]
            maxNumber = max(maxNumber,nums[2*i+1])
            i+=1
        return maxNumber
        