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
    public int optimizedTabulation(int n,int dp[]){
        // base case:
        if(n <= 1)return n;
        // known solution the subproblems
        dp[0] = 0;
        dp[1] = 1;
        
        for(int i =2;i<=n;i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        return dp[n];
    }
    public int spaceOptimizedTabulation(int n){
        // base case:
        if(n<=1)return n;
        
        int firstTerm = 0;
        int secondTerm = 1;
        
        for(int i =2;i<=n;i++){
            // the result of current `n` will be equal to the summation of previous 2 terms
            int nextTerm = firstTerm+secondTerm;
            // now update the first and second terms
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        return secondTerm;
    }
    public int fib(int n) {
        // bruteforce recursive solution
        // int result = unoptimizedRecursion(n);
        
        // optimized recursion using memoization and dynamic programming
        // int dp[] = new int[n+1];
        // int result = optimizedRecursion(n,dp);
        
        // optimization using tabulation and dynamic programming
        // int result = optimizedTabulation(n,dp);
        
        // space optimized using tabulatin and dynamic programming
        int result = spaceOptimizedTabulation(n);
        
        
        return result;
    }
}