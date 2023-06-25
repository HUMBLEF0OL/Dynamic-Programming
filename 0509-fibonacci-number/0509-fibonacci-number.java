class Solution {
    public int unoptimizedHelper(int n){
        // base case:
        if(n <= 1)return n;
        // case 1: n-1
        int result1 = unoptimizedHelper(n-1);
        // case 2: n-2
        int result2 = unoptimizedHelper(n-2);
        return result1+result2;
    }
    public int fib(int n) {
        // bruteforce recursive solution
        int result = unoptimizedHelper(n);
        
        
        return result;
    }
}