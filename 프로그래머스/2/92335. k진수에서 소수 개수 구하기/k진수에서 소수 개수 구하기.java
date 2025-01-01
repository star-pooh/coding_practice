class Solution {
    public int solution(int n, int k) {
        String numString = Integer.toString(n, k);
        String[] numArr = numString.split("0");
        int cnt = 0;
        
        for (String num : numArr) {
            if (num.equals("")) {
                continue;
            }
            
            if (isPrime(num)) {
                cnt++;
            }
        }
        
        return cnt;
    }
    
    private boolean isPrime(String num) {
        long targetNum = Long.parseLong(num);
        
        if (targetNum <= 1) {
            return false;
        }
        
        for (int i = 2; i <= (int) Math.sqrt(targetNum); i++) {
            if (targetNum % i == 0) {
                return false;
            }
        }
        
        return true;
    }
}