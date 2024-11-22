class Solution {
    public String solution(int[] food) {
        StringBuilder temp = new StringBuilder();
        String answer = "";
        
        for (int i = 1; i < food.length; i++) {
            int cnt = food[i] / 2;
            temp.append(String.valueOf(i).repeat(cnt));
        }
        
        return answer.concat(temp.toString()).concat("0").concat(temp.reverse().toString());
    }
}