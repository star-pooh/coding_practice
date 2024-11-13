class Solution {
    public long solution(int price, int money, int count) {
        long result = money;
        
        for (int i = 1; i <= count; i++) {
            result -= i * price;
        }
        
        if (result < 0) {
            return Math.abs(result);
        } else {
            return 0;
        }
    }
}