class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        boolean isPossible = true;
        int idx1 = 0;
        int idx2 = 0;
        
        for (int i = 0; i < goal.length; i++) {
            String target = goal[i];
            
            if (idx1 < cards1.length && cards1[idx1].equals(target)) {
                idx1++;
            }
            
            if (idx2 < cards2.length && cards2[idx2].equals(target)) {
                idx2++;
            }
            
            if (idx1 + idx2 <= i) {
                isPossible = false;
                break;
            }
        }
        
        return isPossible ? "Yes" : "No";
    }
}