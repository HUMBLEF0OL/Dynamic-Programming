class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> previous = new ArrayList<>();
        previous.add(1);
        if(rowIndex == 0)return previous;
        
        for(int i =1;i<=rowIndex;i++){
            List<Integer> currentList = new ArrayList<>();
            int elements = i+1;
            // iterate over the list
            for(int j =0;j<elements;j++){
                if(j == 0 || j == elements-1) currentList.add(1);
                else{
                    System.out.println(previous.get(j)+previous.get(j-1));
                    currentList.add(previous.get(j)+previous.get(j-1));
                }
            }
            // for(int x : currentList)System.out.println(x);
            
            previous = currentList;
        }
        return previous;
    }
}