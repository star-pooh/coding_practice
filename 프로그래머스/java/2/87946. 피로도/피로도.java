class Solution {
    private static int maxDungeons = 0;
    
    public int solution(int k, int[][] dungeons) {
        boolean[] visited = new boolean[dungeons.length];
        explore(k, dungeons, visited, 0);
        
        return maxDungeons;
    }
    
    private void explore(int k, int[][] dungeons, boolean[] visited, int count) {
        maxDungeons = Math.max(maxDungeons, count);
        
        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                explore(k - dungeons[i][1], dungeons, visited, count + 1);
                visited[i] = false;
            }
        }
    }
}