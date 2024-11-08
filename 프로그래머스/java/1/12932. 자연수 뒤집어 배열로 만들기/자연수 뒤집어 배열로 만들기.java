class Solution {
    public int[] solution(long n) {
        int length = Long.toString(n).length();
        int[] numArr = new int[length];
        
        for (int i = 0; i < length; i++) {
            long num = n % 10;
            numArr[i] = (int) num;
            n /= 10;
        }
        
        return numArr;
    }
}