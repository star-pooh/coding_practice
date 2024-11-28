class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        boolean[] isLost = new boolean[n + 2];
        boolean[] hasExtra = new boolean[n + 2];
        
        for (int l : lost) {
            isLost[l] = true;
        }
        
        for (int r : reserve) {
            hasExtra[r] = true;
        }
        
        for (int i = 1; i <= n; i++) {
            if (isLost[i] && hasExtra[i]) {
                isLost[i] = false;
                hasExtra[i] = false;
            }
        }
        
        for (int i = 1; i <= n; i++) {
            if (isLost[i] && hasExtra[i - 1]) {
                isLost[i] = false;
                hasExtra[i - 1] = false;
            } else if (isLost[i] && hasExtra[i + 1]) {
                isLost[i] = false;
                hasExtra[i + 1] = false;
            }
        }
        
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            if (!isLost[i]) {
                cnt++;
            }
        }
        return cnt;
    }
}