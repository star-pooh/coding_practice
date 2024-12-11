class Solution
{
    public int solution(int n, int a, int b)
    {
        int currentRound = 1;
        
        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            
            if (a == b) {
                break;
            }
            currentRound++;
        }
        
        return currentRound;
    }
}