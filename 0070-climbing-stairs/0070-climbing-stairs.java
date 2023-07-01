class Solution {
    // unoptimized recursive solution
    public int unoptimizedRecursion(int n){
        // base condition
        if(n <= 1) return 1;
        
        // now find number of ways of climbing to top
        
        return unoptimizedRecursion(n-1) + unoptimizedRecursion(n-2);
        
    }
    public int optimizedRecursion(int n,int[] dp){
        // if we already know the solution return the answer
        if(dp[n] != 0)return dp[n];
        
        // if the answer of current n is unknown then first calculate the answer then return
        dp[n] = optimizedRecursion(n-1,dp) + optimizedRecursion(n-2,dp);
        return dp[n];
    }
    public int climbStairs(int n) {
        // return unoptimizedRecursion(n);
        // int dp[] = new int[n+1];
        // dp[0] = 1;
        // dp[1]=1;
        // return optimizedRecursion(n,dp);
        
        // bottom-up approach with space optimization
        int first = 1;
        int second = 1;
        
        for(int i =2;i<=n;i++){
            int currentAnswer = first+second;
            first = second;
            second = currentAnswer;
        }
        return second;
        
    }
}