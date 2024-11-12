class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int i = left; i <= right; i++) {
            // 제곱수의 약수 갯수는 항상 홀수이기 때문에
            if (i % Math.sqrt(i) == 0) {
                answer += -1 * i;        
            } else {
                answer += i;
            }
        }
        
        return answer;
    }
}