class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        int idx = 0;
        
        for (String pixel : picture) {
            StringBuilder newPixel = new StringBuilder();
            
            for (char c : pixel.toCharArray()) {
                newPixel.append(Character.toString(c).repeat(k));
            }
            
            for (int i = 0; i < k; i++) {
                answer[idx++] = newPixel.toString();
            }
        }
        
        return answer;
    }
}