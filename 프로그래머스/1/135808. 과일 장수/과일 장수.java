import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        if (score.length < m) {
            return 0;
        }
        
        int box = score.length / m;
        int sum = 0;
        Arrays.sort(score);
        for (int i = 0; i < box; i++) {
            int boxPrice = k;
            
            for (int j = score.length - (i * m) - 1; j > score.length - (i * m) - 1 - m; j--) {
                if (score[j] < boxPrice) {
                    boxPrice = score[j];
                }
            }
            
            sum += boxPrice * m;
        }
        
        return sum;
    }
}