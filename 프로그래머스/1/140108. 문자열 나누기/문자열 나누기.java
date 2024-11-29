class Solution {
    public int solution(String s) {
        int cnt = 0;
        char target = s.charAt(0);
        int targetLen = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char text = s.charAt(i);
            
            if (text == target) {
                targetLen++;
            } else {
                targetLen--;
            }
            
            if (targetLen == 0) {
                cnt++;
                target = s.charAt((i + 1) % s.length());
            }
        }
        
        if (targetLen != 0) {
            cnt++;
        }
        
        return cnt;
    }
}