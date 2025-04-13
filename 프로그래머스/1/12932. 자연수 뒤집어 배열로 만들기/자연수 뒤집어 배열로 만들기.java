class Solution {
    public int[] solution(long n) {
        String number = String.valueOf(n);
        String reverseNumber = new StringBuilder(number).reverse().toString();
        
        char[] reverseNumberArr = reverseNumber.toCharArray();        
        int[] answer = new int[number.length()];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = reverseNumberArr[i] - '0';
        }
        
        return answer;
    }
}