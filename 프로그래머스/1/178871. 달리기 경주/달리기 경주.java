import java.util.HashMap;
import java.util.Map;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> playerMap = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            playerMap.put(players[i], i);
        }
        
        for (String c : callings) {
            String prePlayer = "";
            int idx = playerMap.get(c);
        
            // 앞서고 있던 선수와 추월한 선수의 순위를 변경
            prePlayer = players[idx - 1];
            players[idx - 1] = players[idx];
            players[idx] = prePlayer;    
            
            playerMap.put(prePlayer, idx);
            playerMap.put(c, idx - 1);
        }
        
        return players;
    }
}