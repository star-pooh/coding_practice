public class Solution {
    public int solution(int n) {
        int sum = 0;
        String[] numArr = String.valueOf(n).split("");
        
        for (String num : numArr) {
            sum += Integer.parseInt(num);
        }
        
        return sum;
    }
}