import java.util.stream.IntStream;

class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int[] answer = new int[absolutes.length];
        
        for (int i = 0; i < absolutes.length; i++) {
            answer[i] = signs[i] ? absolutes[i] : -1 * absolutes[i];
        }
        
        return IntStream.range(0, absolutes.length).map(i -> answer[i]).sum();
    }
}