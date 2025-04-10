import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        Map<Integer, Integer> attendanceMap = new HashMap<>();
        
        for (int idx = 0; idx < rank.length; idx++) {
            if (attendance[idx]) {
                attendanceMap.put(rank[idx], idx);
            }
        }
        
        List<Integer> keyList = new ArrayList<>(attendanceMap.keySet());
        Collections.sort(keyList);
        
        int sum = 0;
        
        for (int i = 0; i < 3; i++) {
            sum += Math.pow(100, 2 - i) * attendanceMap.get(keyList.get(i));
        }
        
        return sum;
    }
}