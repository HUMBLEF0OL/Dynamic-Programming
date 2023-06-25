class Solution:
    #
    #   PASCAL TRIANGLE:
    #   if the index is first or last -> value will be 1
    #   else value will be -> [row-1][col-1] + [row-1][col]
    #
    
    def generate(self, numRows: int) -> List[List[int]]:
        output = []
        for i in range(numRows):
            currentRow = [0]*(i+1)
            for j in range(i+1):
                if j == 0 or j == i:
                    currentRow[j]=1
                else:
                    currentRow[j] = output[i-1][j-1] + output[i-1][j]
            output.append(currentRow)
        return output