class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int targetNum = brown + yellow;
        int sqrtNum = (int) Math.sqrt(targetNum);
        
        for (int height = 3; height <= sqrtNum; height++) {
            if (targetNum % height != 0) {
                continue;
            }
            
            int width = targetNum / height;
            int calResult = width * 2 + (height - 2) * 2;
            
            if (brown == calResult) {
                answer[0] = width;
                answer[1] = height;
                break;
            }
        }
        return answer;
    }
}