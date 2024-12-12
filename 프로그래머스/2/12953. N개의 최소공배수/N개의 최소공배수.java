class Solution {
    public int solution(int[] arr) {
        int answer = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            int gcd = gcd(answer, arr[i]);
            answer = answer * arr[i] / gcd;
        }
        
        return answer;
    }
    
    public int gcd(int a, int b) {
        int x = Math.max(a, b);
        int y = Math.min(a, b);
        
        while (y != 0) {
            int z = x % y;
            x = y;
            y = z;
        }
        
        return x;
    }
}