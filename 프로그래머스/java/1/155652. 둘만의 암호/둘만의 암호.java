class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        
        for (char text : s.toCharArray()) {
            int cnt = 0;
            
            while (cnt < index) {
                text = (char) ((text - 97 + 1) % 26 + 97);
                
                if (!skip.contains(String.valueOf(text))) {
                    cnt++;
                }
            }
            answer.append(text);
        }
        return answer.toString();
    }
}