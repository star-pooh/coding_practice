class Solution {
    public int solution(int n, int m, int[] section) {
        int cnt = 0;
        int painted = 0;
        
        for (int area : section) {
            if (area <= painted) {
                continue;
            }
            
            painted = area + m - 1;
            cnt++;
        }
        
        return cnt;
    }
}