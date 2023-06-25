class Solution {
    public int unoptimizedRecursion(int n){
        // base case:
        if(n <= 1)return n;
        // case 1: n-1
        int result1 = unoptimizedRecursion(n-1);
        // case 2: n-2
        int result2 = unoptimizedRecursion(n-2);
        return result1+result2;
    }
    
    public int optimizedRecursion(int n, int dp[]){
        // base case:
        // if we have the solution of the current sub problem
        if(dp[n] != 0)return dp[n];
        // or the value of n <=1
        if(n <= 1)return n;
        
        // find the solution of current subproblem
        dp[n] = optimizedRecursion(n-1,dp) + optimizedRecursion(n-2,dp);
        return dp[n];
        
    }
    public int fib(int n) {
        // bruteforce recursive solution
        // int result = unoptimizedRecursion(n);
        
        // optimized recursion using memoization and dynamic programming
        int dp[] = new int[n+1];
        int result = optimizedRecursion(n,dp);
        
        
        return result;
    }
}