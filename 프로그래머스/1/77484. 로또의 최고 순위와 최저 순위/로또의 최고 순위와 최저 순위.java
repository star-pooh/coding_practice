class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int zeroCnt = 0;
        int cnt = 0;
        for (int i = 0; i < lottos.length; i++) {
            if (lottos[i] == 0) {
                zeroCnt++;
                continue;
            }
            
            for (int j = 0; j < win_nums.length; j++) {
                if (lottos[i] == win_nums[j]) {
                    cnt++;
                }
            }
        }
                
        int[] answer = new int[2];
        answer[0] = getResult(zeroCnt + cnt);
        answer[1] = getResult(cnt);
        
        return answer;
    }
    
    public int getResult(int cntNum) {
        int result;
        
        switch (cntNum) {
            case 6 -> result = 1;
            case 5 -> result = 2;
            case 4 -> result = 3;
            case 3 -> result = 4;
            case 2 -> result = 5;
            default -> result = 6;
        }
        
        return result;
    }
}