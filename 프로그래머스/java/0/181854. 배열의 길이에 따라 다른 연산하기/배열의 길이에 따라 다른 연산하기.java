class Solution {
    public int[] solution(int[] arr, int n) {
        boolean isEven = arr.length % 2 == 0;
        int init = isEven ? 1 : 0;
        
        for (int i = init; i < arr.length; i += 2) {
            arr[i] += n;
        }
        
        return arr;
    }
}