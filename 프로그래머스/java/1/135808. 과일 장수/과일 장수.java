import java.util.Arrays;

class Solution {
    public int solution(int k, int m, int[] score) {
        if (score.length < m) {
            return 0;
        }
        
        Arrays.sort(score);
        int sum = 0;
        
        for (int i = score.length; i >= m; i -= m) {
            sum += score[i - m] * m;
        }
        
        return sum;
    }
}