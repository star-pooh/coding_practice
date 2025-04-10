class Solution {
    public int solution(int[][] arr) {
        boolean isPossible = true;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0 ; j < arr[i].length; j++) {
                if (arr[i][j] != arr[j][i]) {
                    isPossible = false;
                    break;
                }
            }
        }
        
        return isPossible ? 1 : 0;
    }
}