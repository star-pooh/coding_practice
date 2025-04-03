import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        List<Integer> answerList = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    answerList.add(arr[i]);
                }
            } else {
                for (int k = 0; k < arr[i]; k++) {
                    answerList.remove(answerList.size() - 1);
                }
            }
        }
        
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}