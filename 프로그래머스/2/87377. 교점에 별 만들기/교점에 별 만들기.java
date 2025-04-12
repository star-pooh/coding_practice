import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public String[] solution(int[][] line) {
        List<Point> pointList = new ArrayList<>();
        
        for (int i = 0; i < line.length; i++) {
            for (int j = i + 1; j < line.length; j++) {
                Point intersection = intersection(line[i][0], line[i][1], line[i][2], 
                                                  line[j][0], line[j][1], line[j][2]);
                
                if (intersection != null) {
                    pointList.add(intersection);
                }
            }
        }
        
        Point min = getMinPoint(pointList);
        Point max = getMaxPoint(pointList);

        int row = (int) (max.y - min.y + 1);
        int col = (int) (max.x - min.x + 1);
        char[][] arr = new char[row][col];
        
        for (char[] c : arr) {
            Arrays.fill(c, '.');
        }
        
        for (Point p : pointList) {
            int x = (int) (p.x - min.x);
            int y = (int) (max.y - p.y);
            arr[y][x] = '*';
        }
        
        String[] answer = new String[arr.length];
        
        for (int i = 0; i < answer.length; i++) {
            answer[i] = new String(arr[i]);
        }
        
        return answer;
    }
    
    private static class Point {
        public final long x;
        public final long y;
        
        private Point(long x, long y) {
            this.x = x;
            this.y = y;
        }
    }
    
    private Point intersection(long a, long b, long e, long c, long d, long f) {
        double x = (double) (b * f - e * d) / (a * d - b * c);
        double y = (double) (e * c - a * f) / (a * d - b * c);
        
        if (x % 1 != 0 || y % 1 != 0) {
            return null;
        }
        
        return new Point((long) x, (long) y);
    }
    
    private Point getMinPoint(List<Point> pointList) {
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        
        for (Point p : pointList) {
            if (p.x < x) {
                x = p.x;
            }
            
            if (p.y < y) {
                y = p.y;
            }
        }
        
        return new Point(x, y);
    }
    
    private Point getMaxPoint(List<Point> pointList) {
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        
        for (Point p : pointList) {
            if (p.x > x) {
                x = p.x;
            }
            
            if (p.y > y) {
                y = p.y;
            }
        }
        
        return new Point(x, y);
    }
}