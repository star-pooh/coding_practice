import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> progressQueue = new LinkedList<>();
        
        for (int i = 0; i < progresses.length; i++) {
            int remainDays = (int) Math.ceil((100.0 - progresses[i]) / speeds[i]);  
            progressQueue.add(remainDays);
        }
                                             
        int days = progressQueue.poll();
        int count = 1;
        
        while (!progressQueue.isEmpty()) {
            // 다음 작업의 소요 시일이 현재 작업의 소요 시일보다 큰 경우, 현재 작업까지만 배포
            if (progressQueue.peek() > days) {
                answer.add(count);
                days = progressQueue.poll();
                count = 1;
            } else { // 다음 작업의 소요 시일이 현재 작업의 소요 시일보다 작은 경우, 함께 배포하기 위해 담아둠
                count++;
                progressQueue.poll();
            }
        }
        answer.add(count);
                                             
        return answer.stream().mapToInt(i -> i).toArray();
    }
}