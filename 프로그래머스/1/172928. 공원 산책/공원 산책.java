class Solution {
    public int[] solution(String[] park, String[] routes) {
        int row = park.length;
        int col = park[0].length();
        String[][] parkGrid = new String[row][col];
        
        int currentRow = -1; 
        int currentCol = -1;            
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (park[i].charAt(j) == 'S') {
                    currentRow = i;
                    currentCol = j;
                    break;
                }
            }
        }

        for (String route : routes) {
            String[] routeInfo = route.split(" ");
            String direction = routeInfo[0];
            int distance = Integer.parseInt(routeInfo[1]);
            boolean isMove = true;
            
            switch (direction) {
                case "N":
                    for (int i = 1; i <= distance; i++) {
                        if (currentRow - distance < 0 || park[currentRow - i].charAt(currentCol) == 'X') {
                            isMove = false;
                            break;
                        }
                    } 
                    currentRow = isMove ? currentRow - distance : currentRow;
                    break;
                case "S":
                    for (int i = 1; i <= distance; i++) {
                        if (currentRow + distance >= row || park[currentRow + i].charAt(currentCol) == 'X') {
                            isMove = false;
                            break;
                        }
                    }
                    currentRow = isMove ? currentRow + distance : currentRow;
                    break;
                case "W":
                    for (int i = 1; i <= distance; i++) {
                        if (currentCol - distance < 0 || park[currentRow].charAt(currentCol - i) == 'X') {
                            isMove = false;
                            break;
                        }
                    }
                    currentCol = isMove ? currentCol - distance : currentCol;
                    break;
                case "E":
                    for (int i = 1; i <= distance; i++) {
                        if (currentCol + distance >= col || park[currentRow].charAt(currentCol + i) == 'X') {
                            isMove = false;
                            break;
                        }    
                    }
                    currentCol = isMove ? currentCol + distance : currentCol;
                    break;
            }
        }
        return new int[] {currentRow, currentCol};
    }
}