import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] elements) {
        Set<Integer> sumSet = new HashSet<>();
        
        // 부분 수열 크기
        for (int i = 1; i <= elements.length; i++) {
            // 시작 위치
            for (int j = 0; j < elements.length; j++) {
                int sum = 0;
                
                for (int k = 0; k < i; k++) {
                    sum += elements[(j + k) % elements.length];
                }
                sumSet.add(sum);
            }
        }
        return sumSet.size();
    }
}