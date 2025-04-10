import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        BigInteger bigIntegerA = new BigInteger(a);
        BigInteger bigIntegerB = new BigInteger(b);
        
        return bigIntegerA.add(bigIntegerB).toString();
    }
}