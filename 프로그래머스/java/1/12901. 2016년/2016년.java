class Solution {
    public String solution(int a, int b) {
        String[] dateArr = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] dayArr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int sum = 0;
        for (int i = 0; i < a - 1; i++) {
            sum += dayArr[i];
        }
        sum += b - 1;
        
        return dateArr[sum % 7];
    }
}