class Solution {
    public int solution(int n) {
        StringBuilder answer = new StringBuilder();
        
        while (n != 0) {
            answer.append(n % 3);
            n /= 3;
        }
        
        int sum = 0;
        String divNum = answer.toString();
        int len = divNum.length();
        for(int i = 0; i < len; i++) {
            sum += (int) (Math.pow(3, len - i - 1) * (divNum.charAt(i) - '0'));
        }
        
        return sum;
    }
}