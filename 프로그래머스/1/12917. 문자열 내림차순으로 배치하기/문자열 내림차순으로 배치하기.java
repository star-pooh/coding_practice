import java.util.Arrays;

class Solution {
    public String solution(String s) {
        char[] charArr = s.toCharArray();
        Arrays.sort(charArr);
        
        StringBuilder answer = new StringBuilder();
        
        for (char text : charArr) {
            answer.append(text);
        }
        
        return answer.reverse().toString();
    }
}