class Solution {
    public int solution(int left, int right) {
        int sum = 0;
        
        for (int i = left; i <= right; i++) {
            sum += divisor(i) * i;
        }
        
        return sum;
    }
    
    private int divisor(int num) {
        double sqrt = Math.sqrt(num);
        int cnt = 0;
        
        for (int i = 1; i <= sqrt; i++) {
            if (num % i == 0) {
                cnt++;
                
                if (num / i != i) {
                    cnt++;
                }
            }
        }
                
        if (cnt % 2 == 0) {
            return 1;
        } else {
            return -1;
        }
    }
}