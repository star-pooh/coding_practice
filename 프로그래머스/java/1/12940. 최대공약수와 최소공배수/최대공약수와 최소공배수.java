class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int range = Math.min(n, m);
        
        for (int i = range; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                answer[0] = i;
                answer[1] = n * m / answer[0];
                break;
            }
        }
        return answer;
    }
}