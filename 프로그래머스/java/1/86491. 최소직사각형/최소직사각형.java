class Solution {
    public int solution(int[][] sizes) {
        int width = Integer.MIN_VALUE;
        int height = Integer.MIN_VALUE;
        
        for (int[] size : sizes) {
            width = Math.max(width, Math.max(size[0], size[1]));
            height = Math.max(height, Math.min(size[0], size[1]));
        }
        return width * height;
    }
}