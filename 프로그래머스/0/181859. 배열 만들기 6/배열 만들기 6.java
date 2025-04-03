import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> answerList = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (answerList.isEmpty()) {
                answerList.add(arr[i]);
            } else {
                int lastIdx = answerList.size() - 1;
                int lastNum = answerList.get(lastIdx);
                
                if (lastNum == arr[i]) {
                    answerList.remove(lastIdx);
                } else {
                    answerList.add(arr[i]);
                }
            }
        }
        
        if (answerList.isEmpty()) {
            return new int[] {-1};
        } else {
            return answerList.stream().mapToInt(Integer::intValue).toArray();    
        }
    }
}