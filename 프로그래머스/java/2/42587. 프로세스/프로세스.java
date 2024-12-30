import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
                
        for (int i = 0; i < priorities.length; i++) {
            q.add(new int[] {i, priorities[i]});
            pq.add(priorities[i]);
        }
        
        int answer = 0;
        
        while (true) {
            int[] target = q.poll();
            
            // 큐에서 꺼낸 값이 우선 순위 큐의 값 보다 작다면 다시 큐에 삽입
            if (target[1] < pq.peek()) {
                q.add(target);
            } else {
                answer++;
                
                if (target[0] == location) {
                    break;
                }
                
                pq.poll();
            }
        }
        return answer;
    }
}