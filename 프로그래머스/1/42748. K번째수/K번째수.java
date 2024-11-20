import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        int cnt = 0;
        for (int[] command : commands) {
            int[] newArr = Arrays.copyOfRange(array, command[0] - 1, command[1]);
            
            for (int i = 0; i < newArr.length; i++) {
                for (int j = i; j < newArr.length; j++) {
                    if (newArr[i] > newArr[j]) {
                        int temp = newArr[i];
                        newArr[i] = newArr[j];
                        newArr[j] = temp;
                    }
                }
            }
            answer[cnt++] = newArr[command[2] - 1];
        }
        return answer;
    }
}