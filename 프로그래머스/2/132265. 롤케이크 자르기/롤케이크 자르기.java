import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(int[] topping) {
        // Set과 Stream을 사용했더니 시간 초과가 발생해서 Map으로 변경
        Map<Integer, Integer> piece1 = new HashMap<>();
        Map<Integer, Integer> piece2 = new HashMap<>();
        
        // 한 조각에 모든 토핑을 넣은 뒤
        for (int i = 0; i < topping.length; i++) {
            int item = topping[i];
            piece1.put(item, piece1.getOrDefault(item, 0) + 1);
        }
        
        int cnt = 0;
        
        // 다른 조각으로 토핑을 하나씩 옮기기
        for (int i = 0; i < topping.length; i++) {
            int item = topping[i];
            
            piece2.put(item, piece2.getOrDefault(item, 0) + 1);
            
            if (piece1.containsKey(item)) {
                if (piece1.get(item) == 1) {
                    piece1.remove(item);
                } else {
                    piece1.put(item, piece1.getOrDefault(item, 0) - 1);
                }
            }
            
            if (piece1.keySet().size() == piece2.keySet().size()) {
                cnt++;        
            }
        }
        
        return cnt;
    }
}