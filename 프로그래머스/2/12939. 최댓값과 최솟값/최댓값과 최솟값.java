import java.util.Arrays;

class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        int maxNum = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).max().getAsInt();
        int minNum = Arrays.stream(s.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();
        
        answer.append(minNum);
        answer.append(" ");
        answer.append(maxNum);
        return answer.toString();
    }
}