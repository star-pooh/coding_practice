class Solution {
    public int solution(String s) {
        String[] numberArr = new String[] {
            "zero", "one", "two", "three", "four", 
            "five", "six", "seven", "eight", "nine"
        };        
        
        for (int i = 0; i < numberArr.length; i++) {
            s = s.replaceAll(numberArr[i], Integer.toString(i));
        }
        
        return Integer.parseInt(s);
    }
}