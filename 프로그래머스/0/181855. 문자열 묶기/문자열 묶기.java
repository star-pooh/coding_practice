import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        int maxValue = Integer.MIN_VALUE;
        Map<Integer, Integer> answerMap = new HashMap<>();
        
        for (String str : strArr) {
            int length = str.length();
            answerMap.put(length, answerMap.getOrDefault(length, 0) + 1);
        }
        
        for (HashMap.Entry<Integer, Integer> entry : answerMap.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
            }
        }
        
        return maxValue;
    }
}