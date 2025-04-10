import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        List<Integer> answerList = new ArrayList<>();
        List<Integer> deleteList = Arrays.stream(delete_list)
            .boxed()
            .collect(Collectors.toList());
        
        for (int arrNum : arr) {
            if (!deleteList.contains(arrNum)) {
                answerList.add(arrNum);
            }
        }
        
        return answerList.stream().mapToInt(Integer::intValue).toArray();
    }
}