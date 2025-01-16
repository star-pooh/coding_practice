
class Solution {
    public int solution(int x, int y, int n) {
        int[] dp = new int[y + 1];
        
        for (int i = x; i <= y; i++) {
            // 변환할 수 없는 값이면 -1
            if (i != x && dp[i] == 0) {
                dp[i] = -1;
                continue;
            }
            
            // 현재 숫자와 새로운 값 중에서 만들 수 있는 최소 경우의 수를 선택
            if (i + n <= y) {
                dp[i + n] = dp[i + n] == 0 ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i + n]);
            }
            
            if (i * 2 <= y) {
                dp[i * 2] = dp[i * 2] == 0 ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 2]);
            }
            
            if (i * 3 <= y) {
                dp[i * 3] = dp[i * 3] == 0 ? dp[i] + 1 : Math.min(dp[i] + 1, dp[i * 3]);
            }
        }
        
        return dp[y];
    }
}