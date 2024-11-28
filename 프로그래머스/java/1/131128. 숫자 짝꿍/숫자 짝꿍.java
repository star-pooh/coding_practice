class Solution {
    public String solution(String X, String Y) {
        int[] arrX = new int[10];
        int[] arrY = new int[10];
        
        for (int i = 0; i < X.length(); i++) {
            arrX[X.charAt(i) - '0']++;
        }
        
        for (int i = 0; i < Y.length(); i++) {
            arrY[Y.charAt(i) - '0']++;
        }
        
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            if (arrX[i] > 0 && arrY[i] > 0) {
                int cnt = Math.min(arrX[i], arrY[i]);
                answer.append(String.valueOf(i).repeat(cnt));    
            }
        }
        
        if (answer.toString().isEmpty()) {
            return "-1";
        }
        
        if (answer.toString().replace("0", "").isEmpty()) {
            return "0";
        }
        
        return answer.reverse().toString();
    }
}
