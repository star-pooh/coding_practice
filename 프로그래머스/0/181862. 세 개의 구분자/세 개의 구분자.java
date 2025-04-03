class Solution {
    public String[] solution(String myStr) {
        myStr = myStr.replace("a", " ").replace("b", " ").replace("c", " ");
        
        if (myStr.trim().isEmpty()) {
            return new String[] {"EMPTY"};
        } else {
            return myStr.trim().split("\\s+");
        }
    }
}