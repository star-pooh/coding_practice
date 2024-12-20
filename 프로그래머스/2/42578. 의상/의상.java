import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        Map<String, Integer> amountMap = new HashMap<>();
        
        for (String[] cloth : clothes) {
            String itemType = cloth[1];
            
            amountMap.put(itemType, amountMap.getOrDefault(itemType, 0) + 1);
        }
        
        int answer = 1;
        
        for (String itemType : amountMap.keySet()) {
            answer *= amountMap.get(itemType) + 1;
        }
        
        return answer - 1;
    }
}