class Solution {
    public int solution(String t, String p) {
        int len = p.length();
        long pNum = Long.parseLong(p);
        int cnt = 0;
        
        for (int i = 0; i <= t.length() - p.length(); i++) {
            long subNum = Long.parseLong(t.substring(i, i + len));
            
            if (subNum <= pNum) {
                cnt++;
            }
        }
        return cnt;
    }
}