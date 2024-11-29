class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        
        for (int i = 0; i < targets.length; i++) {
            String target = targets[i];
            
            for (int j = 0; j < target.length(); j++) {
                char text = target.charAt(j);
                
                int minIdx = Integer.MAX_VALUE;
                for (String key : keymap) {
                    int idx = key.indexOf(text);
                    
                    if (idx > -1 && minIdx > idx) {
                        minIdx = idx;
                    }
                }
                
                if (minIdx < Integer.MAX_VALUE && answer[i] != -1) {
                    answer[i] += minIdx + 1;
                } else {
                    answer[i] = -1;
                }
            }
        }
        return answer;
    }
}