class Solution {
    public int solution(int a, int b) {
        boolean isEvenA = a % 2 == 0 ? true : false;
        boolean isEvenB = b % 2 == 0 ? true : false;

        if (isEvenA && isEvenB) {
            return Math.abs(a - b);
        } else if (!isEvenA && !isEvenB) {
            return (int) (Math.pow(a, 2) + Math.pow(b, 2));
        } else {
            return (int) 2 * (a + b);
        }
    }
}