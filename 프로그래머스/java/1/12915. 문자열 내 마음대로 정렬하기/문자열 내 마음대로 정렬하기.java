import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public String[] solution(String[] strings, int n) {
        ArrayList<String> list = new ArrayList<>();
        
        for (int i = 0; i < strings.length; i++) {
            String newWord = strings[i].charAt(n) + strings[i];
            list.add(newWord);
        }
        
        Collections.sort(list);
        String[] answer = new String[strings.length];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i).substring(1);
        }
        
        return answer;
    }
}