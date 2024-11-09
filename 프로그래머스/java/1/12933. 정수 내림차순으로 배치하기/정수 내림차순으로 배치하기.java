import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        String[] numArr = String.valueOf(n).split("");
        Arrays.sort(numArr);
        
        for (int i = numArr.length - 1; i > -1; i--) {
            answer *= 10;
            answer += Integer.parseInt(numArr[i]);
        }
        
        return answer;
    }
}