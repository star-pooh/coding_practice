class Solution {
    public int solution(int number, int limit, int power) {
        int sum = 0;
        
        for (int i = 1; i <= number; i++) {
            int cnt = divNumCnt(i);
            
            sum += cnt > limit ? power : cnt;
        }
        return sum;
    }
    
    public static int divNumCnt(int num) {
        int sqrt = (int) Math.sqrt(num);
        int cnt = 0;
        
        for (int i = 1; i <= sqrt; i++) {
            if (num % i == 0) {
                cnt++;
             
                if (num / i != i) {
                cnt++;
                }
            }
        }
        return cnt;
    }
}