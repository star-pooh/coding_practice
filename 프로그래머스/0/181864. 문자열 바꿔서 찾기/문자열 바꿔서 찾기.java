class Solution {
    public int solution(String myString, String pat) {
        String newStr = "";
        
        for (int i = 0; i < myString.length(); i++) {
            char target = myString.charAt(i);
            
            if (target == 'A') {
                newStr += "B";
            } else {
                newStr += "A";
            }
        }
        
        if (newStr.contains(pat)) {
            return 1;
        } else {
            return 0;
        }
    }
}