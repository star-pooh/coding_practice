class Solution {
    public int[] solution(String s) {
        int cnt = 0;
        int zeroAmount = 0;
        while (!s.equals("1")) {
            int beforeLength = s.length();
            
            s = s.replaceAll("0", "");
            int afterLength = s.length();
            
            zeroAmount += beforeLength - afterLength;
            cnt++;
            
            s = Integer.toBinaryString(afterLength);
        }
        
        return new int[] {cnt, zeroAmount};
        
    }
}