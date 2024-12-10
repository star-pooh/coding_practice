class Solution {
    public int solution(int n) {
        int div = 1234567;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) {
            dp[i] = (dp[i - 1] % div + dp[i - 2] % div) % div;
        }
        
        return dp[n];
    }
}