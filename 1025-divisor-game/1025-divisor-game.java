// tricky solution
// class Solution {
//     public boolean divisorGame(int n) {
//        if(n%2==0)
//            return true;
//         return false;
//     }       
// }


class Solution {
    private HashMap<Integer, Boolean> memo;
    public boolean optimizedRecursion(int n, boolean turn){
        //base case: when the value of n is 1 then the current player will loose the game
        if(n == 1)return false;
        
        if(memo.containsKey(n))return memo.get(n);
        
        
        // iterating over all possible factors of n
        for(int i=1;i<n;i++){
            if(n%i == 0 && optimizedRecursion(n-1,!turn) == false){
                memo.put(n,true);
                return true;
            }
        }
        memo.put(n,false);
        return false;
    }
    public boolean divisorGame(int n) {
        // 0 -> Alice and 1 -> Bob
        memo = new HashMap<>();
        return optimizedRecursion(n,true);
    }
}
