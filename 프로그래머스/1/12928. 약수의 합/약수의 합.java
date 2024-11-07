class Solution {
    public int solution(int n) {
        // n의 제곱근을 구함
        double sqrt = Math.sqrt(n);
        int sum = 0;
        
        for (int i = 1; i <= sqrt; i++) {
            // n을 i로 나눴을 때 나머지가 0인 수를 더함
            if (n % i == 0) {
                sum += i;
                
                // n을 i로 나눴을때 몫을 더함
                if (n / i != i) {
                    sum += n / i;
                }
            }
        }
        
        return sum;
    }
}