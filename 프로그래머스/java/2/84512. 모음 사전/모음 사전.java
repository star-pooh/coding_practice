import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final char[] Characters = {'A', 'E', 'I', 'O', 'U'};
    
    public int solution(String word) {
        List<String> wordList = new ArrayList<>();
        init("", wordList);
        
        return wordList.indexOf(word);
    }
    
    private void init(String word, List<String> wordList) {
        wordList.add(word);
        
        if (word.length() == 5) {
            return;
        }
        
        for (char c : Characters) {
            init(word + c, wordList);
        }
    }
}