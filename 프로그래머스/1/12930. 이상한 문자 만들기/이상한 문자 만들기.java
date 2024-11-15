class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] textArr = s.split("");
        
        int idx = 0;
        for (String text : textArr) {
            idx = text.equals(" ") ? 0 : idx + 1;
            
            if (idx % 2 == 0) {
                answer.append(text.toLowerCase());
            } else {
                answer.append(text.toUpperCase());
            }
        }
        return answer.toString();
    }
}