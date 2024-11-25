import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] answers) {
        int[] scores = new int[3];
        int[] stu1 = {1, 2, 3, 4, 5};
        int[] stu2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] stu3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == stu1[i % stu1.length]) {
                scores[0]++;
            }
            if (answers[i] == stu2[i % stu2.length]) {
                scores[1]++;
            }
            if (answers[i] == stu3[i % stu3.length]) {
                scores[2]++;
            }
        }
        
        int maxScore = Arrays.stream(scores).max().orElse(0);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == maxScore) {
                list.add(i + 1);
            }
        }
        
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
} 