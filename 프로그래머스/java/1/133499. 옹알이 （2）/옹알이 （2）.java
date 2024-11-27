class Solution {
    public int solution(String[] babbling) {
        String[] words = {"aya", "ye", "woo", "ma"};
        int cnt = 0;
        
        for (String text : babbling) {
            String preWord = " ";
            
            while (!text.isEmpty()) {
                boolean isBabbling = false;
                
                if (text.contains(preWord) && text.startsWith(preWord)) {
                    break;
                }
                
                for (String word : words) {
                    if (text.contains(word) && text.startsWith(word)) {
                        text = text.replaceFirst(word, "");
                        preWord = word;
                        isBabbling = true;
                    }
                    
                    if (text.isEmpty()) {
                        cnt++;
                        break;
                    }
                }
                
                if (!isBabbling) {
                    break;
                }
            }
        }
        return cnt;
    }
}