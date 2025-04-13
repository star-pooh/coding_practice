import java.util.List;
import java.util.ArrayList;

class Solution {
    public int solution(String s) {
        if (s.length() == 1) {
            return 1;
        }
        
        int minLength = Integer.MAX_VALUE;
        
        for (int length = 1; length <= s.length() / 2; length++) {
            int currentLength = compress(s, length);
            
            if (currentLength < minLength) {
                minLength = currentLength;
            }
        }
        
        return minLength;
    }
    
    private List<String> split(String s, int length) {
        List<String> splitList = new ArrayList<>();
        
        for (int startIdx = 0; startIdx < s.length(); startIdx += length) {
            int endIdx = startIdx + length > s.length() ? s.length() : startIdx + length;
            splitList.add(s.substring(startIdx, endIdx));
        }
        
        return splitList;
    }
    
    private int compress(String s, int length) {
        StringBuilder compressStr = new StringBuilder();
        int cnt = 0;
        String preStr = "";
        
        for (String str : split(s, length)) {
            if (str.equals(preStr)) {
                cnt++;
            } else {
                if (cnt > 1) {
                    compressStr.append(cnt);
                }
                compressStr.append(str);
                preStr = str;
                cnt = 1;
            }
        }
        
        if (cnt > 1) {
            compressStr.append(cnt);
        }
        
        return compressStr.length();
    }
}