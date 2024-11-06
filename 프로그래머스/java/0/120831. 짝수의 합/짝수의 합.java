import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(2, n)
            .filter(num -> num % 2 == 0)
            .sum();
    }
}