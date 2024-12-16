import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            Stack<Character> textStack = new Stack<>();
            String rotatedText = s.substring(i) + s.substring(0, i);
                        
            for (char text : rotatedText.toCharArray()) {
                if (textStack.isEmpty()) {
                    textStack.push(text);
                    continue;
                }
                
                if (text == ')' && textStack.peek() == '(') {
                    textStack.pop();
                    continue;
                } else if (text == '}' && textStack.peek() == '{') {
                    textStack.pop();
                    continue;
                } else if (text == ']' && textStack.peek() == '[') {
                    textStack.pop();
                    continue;
                }
                
                // (, {, [ 만 넣기
                textStack.push(text);
            }
            
            if (textStack.isEmpty()) {
                answer += 1;
            }
        }
        
        return answer;
    }
}