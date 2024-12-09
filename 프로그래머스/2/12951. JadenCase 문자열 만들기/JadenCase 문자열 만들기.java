class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean firstChar = true;
        
        for (int i = 0; i < s.length(); i++) {
            char text = s.charAt(i);
            
            if (text == ' ') {
                answer.append(text);
                firstChar = true;
                continue;
            } 
            
            if (!firstChar) {
                answer.append(Character.toLowerCase(text));
                continue;
            } 
            answer.append(Character.toUpperCase(text));
            firstChar = false;
        }
        
        return answer.toString();
    }
}