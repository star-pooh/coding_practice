import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> numList = new ArrayList<>();
        
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int newNum = numbers[i] + numbers[j];
                
                if (!numList.contains(newNum)) {
                    numList.add(newNum);
                }
            }
        }
        Collections.sort(numList);
        return numList.stream().mapToInt(Integer::intValue).toArray();
    }
}