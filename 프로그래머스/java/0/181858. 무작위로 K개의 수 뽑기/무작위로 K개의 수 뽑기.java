import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        Set<Integer> checkSet = new HashSet<>();
        int idx = 0;
        
        for (int num : arr) {
            if (!checkSet.contains(num) && idx < k) {
                answer[idx++] = num;
                checkSet.add(num);
            }
        }
        
        return answer;
    }
}