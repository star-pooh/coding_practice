import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> scores = new HashMap<>();
        List<Character> types = Arrays.asList('R', 'T', 'C', 'F', 'J', 'M', 'A', 'N');

        for (Character type : types) {
          scores.put(type, 0);
        }
        
        for (int i = 0; i < choices.length; i++) {
            char negative = survey[i].charAt(0);
            char positive = survey[i].charAt(1);
            
            if (choices[i] < 4) {
                scores.put(negative, scores.get(negative) + (4 - choices[i] % 4));
            } else if (choices[i] > 4) {
                scores.put(positive, scores.get(positive) + (choices[i] % 4));
            }
        }
        
        String answer = "";
        answer += scores.get('R') >= scores.get('T') ? "R" : "T";
        answer += scores.get('C') >= scores.get('F') ? "C" : "F";
        answer += scores.get('J') >= scores.get('M') ? "J" : "M";
        answer += scores.get('A') >= scores.get('N') ? "A" : "N";
        
        return answer;
    }
}