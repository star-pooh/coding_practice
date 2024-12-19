import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        Map<String, Integer> wantMap = new HashMap<>();
        
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }
        
        
        Map<String, Integer> copyMap;
        int result = 0;
        
        for (int i = 0; i <= discount.length - 10; i++) {
            copyMap = new HashMap<>();
            copyMap.putAll(wantMap);
            
            for (int j = i; j < i + 10; j++) {
                String product = discount[j];
                
                if (!copyMap.containsKey(product)) {
                    continue;
                }
                
                if (copyMap.get(product) - 1 == 0) {
                    copyMap.remove(product);
                } else {
                    copyMap.put(product, copyMap.get(product) - 1);
                }
            }
            
            if (copyMap.size() == 0) {
                result++;
            }
        }
        
        return result;
    }
}