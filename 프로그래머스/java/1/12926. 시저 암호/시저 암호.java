class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (char text : s.toCharArray()) {
            if (!Character.isAlphabetic(text)) {
                answer.append(text);
                continue;
            }   
            
            if (text >= 'A' && text <= 'Z') {
                text = (char) ((text + n) > 'Z' ? text + n - 26 : text + n);
                answer.append(text);
            } else {
                text = (char) ((text + n) > 'z' ? text + n - 26 : text + n);
                answer.append(text);
            }
        }
        return answer.toString();
    }
}