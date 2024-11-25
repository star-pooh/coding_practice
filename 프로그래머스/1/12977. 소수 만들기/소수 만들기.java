class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(primeCheck(sum)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }
    
    
    private static boolean primeCheck(int num) {
        int sqrt = (int) Math.sqrt(num);
        
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}