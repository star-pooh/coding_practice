class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left + 1)];
        int idx = 0;
        
        for (long i = left; i <= right; i++) {
            // 2차원 배열의 위치, i는 1차원 배열의 인덱스 위치
            // row = i / n;
            // col = i % n;
            answer[idx++] = (int) Math.max(i / n, i % n) + 1;
        }
        
        return answer;        
    }
}