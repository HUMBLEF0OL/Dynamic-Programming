class Solution:
    def countBits(self, n: int) -> List[int]:
        # declaring a list of size n+1
        result = [0]*(n+1)
        for i in range(n+1):
            # if the number is even then number of ones will be equal to the number of ones at i//2 index
            if i%2 == 0:
                result[i] = result[i//2]
            # for odd the number of ones will be equal to number of ones at i//2 index plus 1
            else:
                result[i] = result[i//2]+1
        return result
        