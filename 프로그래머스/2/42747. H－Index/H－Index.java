import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int hIndex = 0;
        int len = citations.length;
        Arrays.sort(citations);
        
        for (int i = 0; i < len; i++) {
            if (citations[i] >= len - i) {
                hIndex = len - i;
                break;
            }
        }
        return hIndex;
    }
}