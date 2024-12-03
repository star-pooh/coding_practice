class Solution {
    public int[] solution(String[] wallpaper) {
        String[][] grid = new String[wallpaper.length][wallpaper[0].length()];
        
        for (int i = 0; i < wallpaper.length; i++) {
            String row = wallpaper[i];
            for (int j = 0; j < wallpaper[0].length(); j++) {
                grid[i][j] = String.valueOf(row.charAt(j));
            }
        }
        
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = Integer.MIN_VALUE;
        int rdy = Integer.MIN_VALUE;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j].equals("#")) {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i);
                    rdy = Math.max(rdy, j);
                }
            }
        }
        rdx++;
        rdy++;
        
        return new int[] {lux, luy, rdx, rdy};
    }
}