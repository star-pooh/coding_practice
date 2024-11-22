import java.util.Arrays;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        
        for (int i = 0; i < score.length; i++) {
            int[] day = new int[i + 1];
            System.arraycopy(score, 0, day, 0, i + 1);
            
            if (day.length <= k) {
                answer[i] = Arrays.stream(day).min().getAsInt();
            } else {
                Arrays.sort(day);
                answer[i] = day[day.length - k];
            }
        }
        
        return answer;
    }
}