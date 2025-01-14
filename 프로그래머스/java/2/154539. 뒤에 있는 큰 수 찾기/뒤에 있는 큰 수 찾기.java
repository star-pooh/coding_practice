import java.util.Stack;

class Solution {
    public int[] solution(int[] numbers) {
        // n^2을 사용했더니 시간 초과
        int size = numbers.length;
        int[] answer = new int[size];
        
        int idx = size - 1;
        answer[idx--] = -1;
        Stack<Integer> numStack = new Stack<>();
        
        // 뒤에서부터 확인
        for (int i = size - 2; i >= 0; i--) {
            int currentNum = numbers[i];
            int nextNum = numbers[i + 1];
            boolean hasNextNum = false;
            
            // 이어진 수가 뒷 큰수라면 반환
            if (currentNum < nextNum) {
                numStack.push(nextNum);
                answer[idx--] = nextNum;
                continue;
            }
            
            // 이어진 수가 뒷 큰수가 아니면 스택 확인
            while (!numStack.isEmpty()) {
                int num = numStack.peek();
                
                if (currentNum < num) {
                    answer[idx--] = num;
                    hasNextNum = true;
                    break;
                } else {
                    numStack.pop();    
                }
            }
            
            // 스택에도 뒷 큰수가 없으면 -1
            if (!hasNextNum) {
                answer[idx--] = -1;
            }
        }
        return answer;
    }
}