import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int powSize = 0;
        int minPowNum = 0;
        
        while(true) {
            minPowNum = (int) Math.pow(2, powSize);
            
            if (minPowNum < arr.length) {
                powSize++;
            } else {
                break;
            }
        }
        
        return Arrays.copyOf(arr, minPowNum);
    }
}