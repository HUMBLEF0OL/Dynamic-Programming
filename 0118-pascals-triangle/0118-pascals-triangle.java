class Solution {
    /*
        PASCAL TRIANGLE:
        if the index is first or last -> value will be 1
        else value will be -> [row-1][col-1] + [row-1][col]
    */
    public List<List<Integer>> generate(int numRows) {
        // output list
        List<List<Integer>> output = new ArrayList<>();
        for(int i = 0;i<numRows;i++){
            // generating current row elements
            List<Integer> currentRow = new ArrayList<>();
            for(int j =0;j<=i;j++){
                if(j == 0 || j == i)currentRow.add(1);
                else currentRow.add(output.get(i-1).get(j-1)+output.get(i-1).get(j));
            }
            output.add(currentRow);
        }
        return output;
    }
}