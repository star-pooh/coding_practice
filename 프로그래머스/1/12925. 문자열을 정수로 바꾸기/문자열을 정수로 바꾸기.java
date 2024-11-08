class Solution {
    public int solution(String s) {
        boolean hasMinus = false;
        int answer = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char num = s.charAt(i);
            
            if (num == '-') {
                hasMinus = true;
                continue;
            } else if (num == '+') {
                continue;
            }
            
            answer = answer * 10 + (num - '0');
        }
        
        return hasMinus ? -1 * answer : answer;
    }
}