class Solution {
    public int[] solution(int n) {
        int[][] triangle = new int[n][n];
        int number = 1;
        int row = 0;
        int col = 0;

        while (true) {
            // 아래로 이동
            while (true) {
                triangle[row][col] = number++;
                
                if (row + 1 == n || triangle[row + 1][col] != 0) {
                    break;
                }
                row += 1;
            }

            if (col + 1 == n || triangle[row][col + 1] != 0) {
                break;
            }
            col += 1;

            // 오른쪽으로 이동
            while (true) {
                triangle[row][col] = number++;
                
                if (col + 1 == n || triangle[row][col + 1] != 0) {
                    break;
                }
                col += 1;
            }
            
            if (triangle[row - 1][col - 1] != 0) {
                break;
            }
            row -= 1;
            col -= 1;

            // 왼쪽 위로 이동
            while (true) {
                triangle[row][col] = number++;
                
                if (triangle[row - 1][col - 1] != 0) {
                    break;
                }
                row -= 1;
                col -= 1;
            }
            
            if (row + 1 == n || triangle[row + 1][col] != 0) {
                break;
            }
            row += 1;
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