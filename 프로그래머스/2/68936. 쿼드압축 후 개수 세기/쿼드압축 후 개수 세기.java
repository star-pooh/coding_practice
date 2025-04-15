class Solution {
    public int[] solution(int[][] arr) {
        Count count = count(0, 0, arr.length, arr);
        return new int[] {count.zero, count.one};
    }
    
    private static class Count {
        public final int zero;
        public final int one;
        
        public Count(int zero, int one) {
            this.zero = zero;
            this.one = one;
        }
        
        public Count add(Count other) {
            return new Count(zero + other.zero, one + other.one);
        }
    }
    
    private Count count(int offsetX, int offsetY, int size, int[][] arr) {
        for (int x = offsetX; x < offsetX + size; x++) {
            for (int y = offsetY; y < offsetY + size; y++) {
                if (arr[y][x] != arr[offsetY][offsetX]) {
                    return count(offsetX, offsetY, size / 2, arr)
                        .add(count(offsetX + size / 2, offsetY, size / 2, arr))
                        .add(count(offsetX, offsetY + size / 2, size / 2, arr))
                        .add(count(offsetX + size / 2, offsetY + size / 2, size / 2, arr));
                }
            }
        }
        
        if (arr[offsetY][offsetX] == 1) {
            return new Count(0, 1);
        }
        return new Count(1, 0);
    }
}