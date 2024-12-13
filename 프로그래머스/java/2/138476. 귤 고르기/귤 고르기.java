import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(int k, int[] tangerine) {
        Map<Integer, Integer> tangerineMap = new HashMap<>();
        
        for (int size : tangerine) {
            tangerineMap.put(size, tangerineMap.getOrDefault(size, 0) + 1);
        }
        
        List<Integer> sizeList = new ArrayList<>(tangerineMap.keySet());
        sizeList.sort((a, b) -> tangerineMap.get(b) - tangerineMap.get(a));
        
        int answer = 0;
        for (int size : sizeList) {
            k -= tangerineMap.get(size);
            answer++;
            
            if (k <= 0) {
                break;
            }
        }
        
        return answer;
    }
}
