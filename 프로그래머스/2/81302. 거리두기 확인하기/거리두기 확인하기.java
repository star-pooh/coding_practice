class Solution {
    // 반대 방향의 인덱스끼리 더하면 같은 값(3)이 될 수 있도록 순서 수정
    // 상하좌우 -> 상좌우하
    private static final int[] dx = {0, -1, 1, 0};
    private static final int[] dy = {-1, 0, 0, 1};
    
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        
        for (int i = 0; i < answer.length; i++) {
            String[] place = places[i];
            char[][] room = new char[place.length][];
            
            for (int j = 0; j < room.length; j++) {
                room[j] = place[j].toCharArray();
            }
            
            if (isDistanced(room)) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }
        
        return answer;
    }
    
    private boolean isDistanced(char[][] room) {
        for (int y = 0; y < room.length; y++) {
            for (int x = 0; x < room[y].length; x++) {
                if (room[y][x] != 'P') {
                    continue;
                }
                
                if (!isDistanced(room, x, y)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean isDistanced(char[][] room, int x, int y) {
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            
            if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length) {
                continue;
            }
            
            switch (room[ny][nx]) {
                case 'P' : return false;
                case 'O' : 
                    if (isNextParticipant(room, nx, ny, 3 - d)) {
                        return false;
                    }
                    break;
            }
        }
        return true;
    }
    
    private boolean isNextParticipant(char[][] room, int x, int y, int exclude) {
        for (int d = 0; d < 4; d++) {
            if (d == exclude) {
                continue;
            }
            
            int nx = x + dx[d];
            int ny = y + dy[d];
            
            if (ny < 0 || ny >= room.length || nx < 0 || nx >= room[ny].length) {
                continue;
            }
            
            if (room[ny][nx] == 'P') {
                return true;
            }
        }
        return false;
    }
}