class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int a = arr1.length;
        int b = arr2.length;
        int c = arr1[0].length;
        int d = arr2[0].length;
        
        int[][] answer = new int[a][d];
        
        for (int i = 0; i < a; i++) { // arr1 행
            for (int j = 0; j < d; j++) { // arr2 열
                int sum = 0;
                
                for (int k = 0; k < b; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum;
            }
        }
        
        return answer;
    }
}