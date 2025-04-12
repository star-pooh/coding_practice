class Solution {
    private static final int dx[] = {0, 1, -1};
    private static final int dy[] = {1, 0, -1};
    
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int number = 1;
        int x = 0;
        int y = 0;
        int dir = 0;
        
        while (true) {
            triangle[y][x] = number++;
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
            if (nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) {
                dir = (dir + 1) % 3;
                nx = x + dx[dir];
                ny = y + dy[dir];
            
                if (nx == n || ny == n || nx == -1 || ny == -1 || triangle[ny][nx] != 0) {
                    break;
                }
            }
            x = nx;
            y = ny;
        }
        
        int[] answer = new int[number - 1];
        int idx = 0;
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                answer[idx++] = triangle[i][j];
            }
        }
        
        return answer;
    }
}